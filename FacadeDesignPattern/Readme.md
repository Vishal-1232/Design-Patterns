# Facade Design Pattern

## When to Use:
It is used when we have to hide the system complexity from client.  
  
**example:** when client press accelerator or brake in car then the complexity behind how things are working are hidden. so we can say we provided client a ==Facade Layer== where accelerator,brake and Stearing etc are present.  


> we should not force client to use Facade layer, if client wants to go through the complexity then he can go.

> Facade can use another facade also

## Facade v/s Proxy
Proxy is of particular object only i.e the interface used in object class must be same for the proxy class too.

## Disadvantages:
- Any Change in the logic of classes can also impact client if he is not using facade layer and directly communicating with complex system.
  
- 