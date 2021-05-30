# Abstract-Factory-using-Java-Component-desogn-assignment

Abstract Factory is a creational design pattern also known as Kit. This design pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client does not know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products.This pattern separates the details of the implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.

# Generally, an abstract design pattern is applicable:-

When the client doesn’t need to know how the final product is actually created. When the system demands the creation of a library of products, for which only interfaces are required, not the implementation .When the system needs to be configured with one of a multiple-family of objects. When the classes of the product objects are variable, and dependencies on these classes must be removed from a client application. When variations on the creation, composition, or representation of aggregate objects or subsystems must be removed from a client application

# Ethiopian traditional food catering

In this application, we are going to design a simple Ethiopian traditional food catering that implements an abstract design pattern that provides a variety of traditional food like dorowet,kitfo and shiro. Customers can order different delicious traditional food. Therefore, we will build a food factory to make different types of foods. The factory produces two types of food for each of the foods listed under the traditional food. This means the factory produces 6 different types of Ethiopia’s traditional food.

The main method is in the AbstractFactoryApp class

E:\book\4th year\Component Design\project\AbstractFactory\Abstract Factory.jpg
