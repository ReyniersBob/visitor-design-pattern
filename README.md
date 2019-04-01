# Visitor pattern exercise

## What is the visitor pattern?

Represent an operation to be performed on elements of an object structure. 
Visitor lets you define a new operation without changing the classes of the elements on which it operates.

The nature of the Visitor makes it an ideal pattern to plug into public APIs thus allowing
 its clients to perform operations on a class using a "visiting" class without having to modify the source.
 
## What problems can the Visitor design pattern solve? 

When new operations are needed frequently and the object structure consists of many unrelated classes, it's inflexible to add new subclasses each time a new operation is required because distributing all these operations across the various node classes leads to a system that's hard to understand, maintain, and change.

## How do i use this?

Define a separate (visitor) object that implements an operation to be performed on elements of an object structure.

Clients traverse the object structure and call a dispatching operation accept(visitor) on an element  that "dispatches" (delegates) the request to the "accepted visitor object". 

The visitor object then performs the operation on the element ("visits the element").
This makes it possible to create new operations independently from the classes of an object structure by adding new visitor objects.

## Exercises are described in the GameRules.md
