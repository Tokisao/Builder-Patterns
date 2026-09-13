# Coffee Shop — Builder Patterns

A small Java application that demonstrates the **Builder** design pattern by
constructing different coffee representations (Espresso, Latte) step by step,
with validation rules enforced at build time.

## Product

`Coffee` is an immutable product with the following fields:

| Field        | Description                          |
|--------------|--------------------------------------|
| name         | Drink name (e.g. "Espresso")         |
| size         | small / medium / large               |
| milk         | Milk type or "none"                  |
| syrup        | Syrup type or "none"                 |
| topping      | Topping or "none"                    |
| temperature  | hot / iced                           |
| extraShots   | Number of extra espresso shots       |

`Coffee` has a package-private constructor — it can only be created through a
`CoffeeBuilder`.

## Builders

Each concrete builder implements the `CoffeeBuilder` interface and provides
sensible defaults plus validation in `build()`.                                    

The `BaristaDirector` encapsulates common recipes:

```java 
director.makeEspresso(new EspressoBuilder());  // hot, 2 shots
director.makeLatte(new LatteBuilder());        // oat milk, hot, 1 shot
