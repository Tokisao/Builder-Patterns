# Coffee Shop — Builder Patterns

A small Java application that demonstrates the **Builder** design pattern by
constructing different coffee representations (Espresso, Latte) step by step,
with validation rules enforced at build time.

## Project Structure

```
Builder-Patterns/
├── README.md
└── src/
    ├── Coffee.java
    ├── CoffeeBuilder.java
    ├── EspressoBuilder.java
    ├── LatteBuilder.java
    ├── BaristaDirector.java
    └── CoffeeShopApp.java
```

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
```
## How to Build

From the project root (where `src/` lives):

```bash
# Compile all sources into an "out" directory
mkdir -p out
javac -d out src/*.java
```

## How to Run

```bash
java -cp out CoffeeShopApp
```

Expected output:

```text
Coffee recipe: 
Name: Espresso
Enums.Size: small
Enums.Milk: none
Syrup: none
Topping: none
Enums.Temperature: hot
Extra shots: 2

Coffee recipe: 
Name: Latte
Enums.Size: medium
Enums.Milk: oat
Syrup: none
Topping: none
Enums.Temperature: hot
Extra shots: 1
```

## Design Notes

- **Builder** decouples construction from representation — the same director
  can produce different drinks using different builders.
- **Validation** lives in each concrete builder's `build()` method, so invalid
  combinations fail fast with `IllegalStateException`.
- **Immutability** is preserved: `Coffee` exposes no setters and its
  constructor is package-private.



