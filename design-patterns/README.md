# Design Pattern examples in Java
Purpose of the repository is for me to learn and practice design patterns in java.

## Singleton
Restricts the instantiation of a class to one. 
In the example it creates a object to create and hold a single one database connection-

## Builder
Builds a complex object using a step by step approach. 
In the example we build a Customer object, which also becomes immutable once created (no setters).

## Adapter
Allows otherwise incompatible classes to work together.
In the example Flygplan.java 
(representing a legacy class which we pretend can not be changed) 
is made to work with the Airplane interface.

## Bridge
> "Meant to decouple an abstraction from its implementation so that the two can vary independently".

In code example Persistors and FileWriters can vary independently, 
and if another Persistor is added it can use the existing FileWriters without requiring any changes in them,
and vice versa.

## Composite
Generalizes a hieracrchical structure. 
A tree structure, where composites and leafs have same interface.
In the code example animals groups are composites which can contain both other animal groups and animals (which are leaf nodes).

## Facade
Simplifies client interface. 
In example the mongodb API is much simplified to the client to allow 
only to to add and list flowers in the database.

*Example requires mongodb installed locally and running on default port 27017 to work*.

## Factory
Create object without exposing the creation logic to the client. 
In the example the AnimalFactory method getInstance can create different types of Farm Animals which all 
implement the interface Animal based on what parameter is passed in.
