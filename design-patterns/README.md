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
