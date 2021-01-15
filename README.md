# RabbitMQ-Publisher
RabbitMQ is implementing Advanced Message Queuing Protocol (AMQP). There are other messaging tools that are implementing AMQP like ActiveMQ or ApacheQpid.

<br /> RabbitMQ is easy to implement. It has push-based approach in sending message, but it is centralized and less scalable. 
<br />
<br /> We can send any type of message like text, file, and object with RabbitMQ. To be able to send a message to RabbitMQ:
 we can to add Exchange on RabbitMQ dashboard and add queue and bind them with a routing key. 
 
 - Install RabbitMQ: brew install rabbitmq (we may need to change permission: chmod u+w /usr/local/lib/pkgconfig)
 - Start RabbitMQ: brew services start rabbitmq
 - login with user and password guest to http://localhost:15672/ 
 - Create a TestExchange, RoutedQueue, and bind them with testRouting as Routing Key.
 - To send a message from our spring boot application to the created Exchange, we need to add amqp dependency.

 
  
