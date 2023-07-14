# ECommerce-Development
<p> This repository will detail the indepth methodology on developing an Ecommerce website, and for general Supply Chain Automation as part of a Final Year Academic Project. The following project aims to design a solution that will solve the business-challenges faced by a company through the use of automation. In short, the problem is the need for an ecommerce website that can integrate into the company’s existing ERP (Enterprise Resource Planning) software system that can also automate critical business processes such as invoice requesting and customer service. The requirements were gathered from both system analaysis and input from a multitude of stakeholders (CEO/Financial Manager/Supply Chain Manager/Delivery Drivers) </p>

<p> The project in detail was accomplished using Spring Boot for the backend server, MySQL for backend storage, JPA for Object-Relational Mapping, ReactJS for frontend along with some Xero API intergration. The final solution is a full stack web-service that consists of a frontend server and several back-end microservices that also incorporates a chatbot – effectively the ecommerce website described earlier. The backend microservices will also communicate with a cloud database and the company’s ERP (Enterprise Resource Planning) software web-API to create, read, update, and delete data to the corresponding databases. The system will then create an invoice and bill the user through the Xero API and send an invoice through their email. The payment gateway will also be implemented through Xero's configuration system. </p>
  
<p> Due to confidentiality and security issues, large portions of code cannot be uploaded here, but this repository will give as detailed review as possible on the process and possible obstacles that come when implementing an ecommerce website. The code also utilsies the XeroAPI repository, which is available <a href="https://github.com/XeroAPI/Xero-Java/"> here </a>, but will also be included in the file system.</p>



<h2> System Analysis </h2>
<p> Before even jumping into a project, one must analyse the current system to identify key areas of weaknesses. As the main interest was business process efficiency through automation, one of the most ideal business analysis techniques was Workflow Analysis. Workflow analysis essentially identifies the tasks for a certain person or employee in a given business process, and how these tasks are passed onto the next role. This allows us to identify redudndant tasks, inefficient workspace layouts and potential bottlenecks in the workflow. What we can find in some circumstances is that regular administrative employees can be swamped in a number of processes - some of which can be solved through automating part of their tasks. Likewise, there may be inefficiency in how these are passed onto the next role - such as a manual telephone call to a supplier which can be replaced with an automatic invoice to a supplier. </p>

<p> Another critical analysis technique used was Data Flow Analysis to model where information - at its most atomic form - derives from to form larger systems of information. Employees that are a master of their work tend to have critical information imprinted in their head (such as a car dealer memorising the costs of all their cars) which often tends to lead to a lack of datasource compatible with our system, and it is useful to know what data we may need to model, and what databases we may need to create as part of a new system. </p>

<h2> Current Solutions </h2>
<p> A plethora of solutions already exist for an ecommerce solutions. Big businesses that care for the run-of-the-mill processes should opt for Sage, as they have a trial and tested Stock Management system, Accounting system, Logistics and Book-Keeping system - however ecommerce is not part of this and an independent software developer vendor may need to be hired on top of this. To develop software compatible with Sage software, one would need to apply for an independent Software Developer Vendor License with Sage (at a price of ~£2,000) to access the Sage Software Development Kit. </p>
  
<p> Those that consider themselves to be smaller and have a tighter budget and are more ecommerce oriented should opt for options such as Shopify, with simpler subsystems that minimise the amount of work needed to manage those subsystems.  </p>

<p> However, those that want high customisability should opt for the Xero ERP system - particularly if the company owns a programming powerhouse (or a bored individual). Be warned however, that trying to offload some functionality by purchasing plugins from the market place can be extremely costly - advanced stock systems may incur an extra £500 monthly - and should only be considered if the company can program their way out of most problems.</p>

<h2> Data Laws </h2>

<h2> OAuth2 and Connection Establishment </h2>

<h2> Database Synchronisation </h2>
<p> The Xero ERP system contains a lightweight stock system which may be insufficient - we may need to store more details about a product such as a product image, product weight, etc, which Xero does not allow. As mentioned before, shelling out money to extend the Xero database may be extremely costly, and so we will opt to extend the system by creating a MySQL database for products, where the ID for the Xero product will correspond to a new ID for our MySQL product table. However, this also introduces the problem of database synchronisation. </p>

<p> Synchronisation can be unidrectional or two-directional. Here, unidirectional synchronisation was implemented as it was not critical to keep track of products that were no longer in the ERP system - the website will simply not display them to the user. A module was created - called UpdateProducts.Java - that would retrieve the Xero products from the database and would compare them to our MySQL products table. The program will then identify which were not in the MySQL system, and then created records with null values accordingly. This would then prompt an administrator to enter some details about the new product. Hence, whenver a product was added or removed from the Xero database, the program would then adjust the MySQL database accordingly. </p>


<h2> Microservices - Not a Silver Bullet </h2>

<h2> Microservices - It Happened Anyway </h2>


