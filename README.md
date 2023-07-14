# ECommerce-Development
<p> This repository will detail the indepth methodology on developing an Ecommerce website, and for general Supply Chain Automation as part of a Final Year Academic Project. The following project aims to design a solution that will solve the business-challenges faced by a company through the use of automation. In short, the problem is the need for an ecommerce website that can integrate into the company’s existing ERP (Enterprise Resource Planning) software system that can also automate critical business processes such as invoice requesting and customer service. The requirements were gathered from both system analaysis and input from a multitude of stakeholders (CEO/Financial Manager/Supply Chain Manager/Delivery Drivers) </p>

<p> The project in detail was accomplished using Spring Boot for the backend server, MySQL for backend storage, JPA for Object-Relational Mapping, ReactJS for frontend along with some Xero API intergration. The final solution is a full stack web-service that consists of a frontend server and several back-end microservices that also incorporates a chatbot – effectively the ecommerce website described earlier. The backend microservices will also communicate with a cloud database and the company’s ERP (Enterprise Resource Planning) software web-API to create, read, update, and delete data to the corresponding databases. The system will then create an invoice and bill the user through the Xero API and send an invoice through their email. The payment gateway will also be implemented through Xero's configuration system. </p>
  
<p> Due to confidentiality and security issues, large portions of code cannot be uploaded here, but this repository will give as detailed review as possible on the process and possible obstacles that come when implementing an ecommerce website. The code also utilsies the XeroAPI repository, which is available <a href="https://github.com/XeroAPI/Xero-Java/"> here </a>, but will also be included in the file system. The Xero API can also be intergrated via Maven by adding the following dependency in the pom.xml file:</p>

```
<dependency>
  <groupId>com.github.xeroapi</groupId>
  <artifactId>xero-java</artifactId>
  <version>4.X.X</version>
</dependency>
```


<h2> System Analysis </h2>
<p> Before even jumping into a project, one must analyse the current system to identify key areas of weaknesses. As the main interest was business process efficiency through automation, one of the most ideal business analysis techniques was Workflow Analysis. Workflow analysis essentially identifies the tasks for a certain person or employee in a given business process, and how these tasks are passed onto the next role. This allows us to identify redudndant tasks, inefficient workspace layouts and potential bottlenecks in the workflow. What we can find in some circumstances is that regular administrative employees can be swamped in a number of processes - some of which can be solved through automating part of their tasks. Likewise, there may be inefficiency in how these are passed onto the next role - such as a manual telephone call to a supplier which can be replaced with an automatic invoice to a supplier. </p>

<p> Another critical analysis technique used was Data Flow Analysis to model where information - at its most atomic form - derives from to form larger systems of information. Employees that are a master of their work tend to have critical information imprinted in their head (such as a car dealer memorising the costs of all their cars) which often tends to lead to a lack of datasource compatible with our system, and it is useful to know what data we may need to model, and what databases we may need to create as part of a new system. </p>

<h2> Current Solutions </h2>
<p> A plethora of solutions already exist for an ecommerce solutions. Big businesses that care for the run-of-the-mill processes should opt for Sage, as they have a trial and tested Stock Management system, Accounting system, Logistics and Book-Keeping system - however ecommerce is not part of this and an independent software developer vendor may need to be hired on top of this. To develop software compatible with Sage software, one would need to apply for an independent Software Developer Vendor License with Sage (at a price of ~£2,000) to access the Sage Software Development Kit. </p>
  
<p> Those that consider themselves to be smaller and have a tighter budget and are more ecommerce oriented should opt for options such as Shopify, with simpler subsystems that minimise the amount of work needed to manage those subsystems.  </p>

<p> However, those that want high customisability should opt for the Xero ERP system - particularly if the company owns a programming powerhouse (or a bored individual). Be warned however, that trying to offload some functionality by purchasing plugins from the market place can be extremely costly - advanced stock systems may incur an extra £500 monthly - and should only be considered if the company can program their way out of most problems.</p>

<h2> Data Laws </h2>

<h2> OAuth2 and Connection Establishment </h2>
<p> There are a number of flows to use to establish connection with the Xero API, but we will opt for the Code Flow. Users are authorized to access protected resources on Xero using an authorization process called OAuth2 – protected resources cannot be accessed without a valid access token. If an access token is valid but expired, it can be refreshed using a separate token called a refresh token. For a user to obtain a token, they must first obtain a code from the Xero API. The code can then be exchanged once more with the API to obtain an access token and a refresh token.  </p>

<p> Our system will store the Code, Access Token and Refresh Token values inside the system itself rather than the cookies provided in the Xero-API example, hence this will abstract the information away from this user. This is because the users of our system, franchisees, should not have authorization to CRUD to the Xero database directly and creates potential for misuse. By storing the information locally, the website acts as a user to the database and hence a handler or a proxy to interact with the Xero API. This is somewhat achievable with a single connection as we have a limited numbe of users (we can estimate that there should be no more than three users using our ecommerce website at a given instance). </p>

<h3> Useful Resources</h3>
<ul>
  <li> <a href="https://developer.xero.com/documentation/guides/oauth2/overview/"> Determining the Right Flow to Use </a> </li>
  <li> <a href="https://developer.xero.com/documentation/guides/oauth2/auth-flow"> How to work with the Code Flow </a> </li>
</ul>

<h2> Working with the Code Flow </h2>
<p> To enable authorisation, we must first acquire 3 important pieces of detail:  The Client ID, the Client Secret and the Callback URL. The client and the secret (which can be generated) can be obtained through the Xero Developer website whilst the callback URL can be configured. In this instance we will configure the callback URL as "http://localhost:8080/Callback". Now we can summarise the authorisation with the following steps:</p>
<ol>
  <li> Build our Authorization link </li>
  <li> Redirect the Administrator to the Xero Website (through the REST controller)</li>
  <li> Check our Secret State </li>
  <li> Exchange the Code for Access Tokens and store them </li>
  <li> Use the API </li>
</ol>

<h4> Building the Authorization link</h4>
<p> The client ID, secret and callback URL should be stored securely somewhere in our application, and retrieved by a module. To build our URL, we would need to construct a JacksonFactory, a MemoryDataStoreFactory and a NetHttpTransport object to work with the AuthorizationCodeFlow builder we will use. We will also autogenerate a radom int for our secret. </p>

```
// Import necessary libraries
import com.fasterxml.jackson.core.JsonFactory;
import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.MemoryDataStoreFactory;

...
      // Static Links from Xero...
    private String TOKEN_SERVER_URL = "https://identity.xero.com/connect/token";
    private String AUTHORIZATION_SERVER_URL = "url= https://login.xero.com/identity/connect/authorize";

    // Obtaining some values through injection - if experimenting, just assign them here directly as plaintext.
    @Value("${xero.client-id}")
    private String clientId;
    @Value("${xero.client-secret}")
    private String clientSecret;
    @Value("${xero.callback-url}")
    private String redirectURI;

    // Some objects we will use...
    final NetHttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    final JacksonFactory JSON_FACTORY = new JacksonFactory();
    DataStoreFactory DATA_STORE_FACTORY = new MemoryDataStoreFactory();

    // Used to check the callback and prevent forgery...
    String secretState = "secret" + new Random().nextInt(999_999);    
...
```

<p> We will then need to create an arraylist of scopes that we want our program to access. These should be minimised as this grants potential for misuse in our system.</p>

```
	    // Creating our list of scopes (essentially permissions) of what our microservice should handle...
        ArrayList<String> scopeList = new ArrayList<String>();
        scopeList.add("openid");
        scopeList.add("email");
        scopeList.add("profile");
        scopeList.add("offline_access");
        scopeList.add("accounting.settings");
        scopeList.add("accounting.transactions");
        scopeList.add("accounting.contacts");
        scopeList.add("accounting.journals.read");
        scopeList.add("accounting.reports.read");
        scopeList.add("accounting.attachments");
```

<p>
  The next step is to build our AuthorizationCodeFlow and build the URL from the flow, before redirecting the user to the Xero webpage.
</p>

```
// Building an authorisation flow... (Adding clientID and Secret and Scopes)
        // For AUTHORIZATION
        DataStoreFactory DATA_STORE_FACTORY = new MemoryDataStoreFactory();
        AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder(BearerToken.authorizationHeaderAccessMethod(),
                HTTP_TRANSPORT, JSON_FACTORY, new GenericUrl(TOKEN_SERVER_URL),
                new ClientParametersAuthentication(clientId, clientSecret), clientId, AUTHORIZATION_SERVER_URL)
                .setScopes(scopeList).setDataStoreFactory(DATA_STORE_FACTORY).build();
        
        // Setting the URL with ClientID, Scopes, SecretState and Redirect URI
        String url = flow.newAuthorizationUrl().setClientId(clientId).setScopes(scopeList).setState(secretState)
                .setRedirectUri(redirectURI).build();
        
	    return url; // Main controller should redirect the user to this URL value
```

     
<h2> Database Synchronisation </h2>
<p> The Xero ERP system contains a lightweight stock system which may be insufficient - we may need to store more details about a product such as a product image, product weight, etc, which Xero does not allow. As mentioned before, shelling out money to extend the Xero database may be extremely costly, and so we will opt to extend the system by creating a MySQL database for products, where the ID for the Xero product will correspond to a new ID for our MySQL product table. However, this also introduces the problem of database synchronisation. </p>

<p> Synchronisation can be unidrectional or two-directional. Here, unidirectional synchronisation was implemented as it was not critical to keep track of products that were no longer in the ERP system - the website will simply not display them to the user. A module was created - called UpdateProducts.Java - that would retrieve the Xero products from the database and would compare them to our MySQL products table. The program will then identify which were not in the MySQL system, and then created records with null values accordingly. This would then prompt an administrator to enter some details about the new product. Hence, whenver a product was added or removed from the Xero database, the program would then adjust the MySQL database accordingly. </p>


<h2> Microservices - Not a Silver Bullet </h2>

<h2> Microservices - It Happened Anyway </h2>


