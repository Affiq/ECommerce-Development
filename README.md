# ECommerce-Development
<p> This repository will detail the indepth methodology on developing an Ecommerce website, and for general Supply Chain Automation as part of a Final Year Academic Project. The following project aims to design a solution that will solve the business-challenges faced by a company through the use of automation. In short, the problem is the need for an ecommerce website that can integrate into the company’s existing ERP (Enterprise Resource Planning) software system that can also automate critical business processes such as invoice requesting and customer service. The requirements were gathered from both system analaysis and input from a multitude of stakeholders (CEO/Financial Manager/Supply Chain Manager/Delivery Drivers) </p>

<p> The project in detail was accomplished using Spring Boot for the backend server, MySQL for backend storage, JPA for Object-Relational Mapping, ReactJS for frontend along with some Xero API intergration. The final solution is a full stack web-service that consists of a frontend server and several back-end microservices that also incorporates a chatbot – effectively the ecommerce website described earlier. The backend microservices will also communicate with a cloud database and the company’s ERP (Enterprise Resource Planning) software web-API to create, read, update, and delete data to the corresponding databases. The system will then create an invoice and bill the user through the Xero API and send an invoice through their email. The payment gateway will also be implemented through Xero's configuration system. </p>
  
<p> Due to confidentiality and security issues, large portions of code cannot be uploaded here, but this repository will give as detailed review as possible on the process and possible obstacles that come when implementing an ecommerce website. </p>



<h2> System Analysis </h2>

<h2> Current Solutions </h2>
<p> A plethora of solutions already exist for an ecommerce solutions. Big businesses that care for the run-of-the-mill processes should opt for Sage, as they have a trial and tested Stock Management system, Accounting system, Logistics and Book-Keeping system - however ecommerce is not part of this and an independent software developer vendor may need to be hired on top of this. To develop software compatible with Sage software, one would need to apply for an independent Software Developer Vendor License with Sage (at a price of ~£2,000) to access the Sage Software Development Kit. </p>
  
<p> Those that consider themselves to be smaller and have a tighter budget and are more ecommerce oriented should opt for options such as Shopify, with simpler subsystems that minimise the amount of work needed to manage those subsystems.  </p>

<p> However, those that want high customisability should opt for the Xero ERP system - particularly if the company owns a programming powerhouse (or a bored individual). Be warned however, that trying to offload some functionality by purchasing plugins from the market place can be extremely costly - advanced stock systems may incur an extra £500 monthly - and should only be considered if the company can program their way out of most problems.</p>

<h2> Data Laws </h2>

<h2> OAuth2 and Connection Establishment </h2>

<h2> Database Synchronisation </h2>

<h2> Microservices - Not a Silver Bullet </h2>

<h2> Microservices - It Happened Anyway </h2>


