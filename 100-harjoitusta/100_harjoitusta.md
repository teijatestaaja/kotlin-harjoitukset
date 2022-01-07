# 100 harjoitusta

## 1. Lista

1.1 Luo lista ja lisää elementtejä listaan. [Ratkaisu](ratkaisut/lista.kt). Lisätietoa: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/), [Collections overview](https://kotlinlang.org/docs/collections-overview.html#collection)

```
Opittua: Kotlinissa on kaksi lista-tietorakennetta: List (muuttumaton lista) ja MutableList (muuttuva lista). 

add-funktio ei ole käytettävissä muuttumattomalle listalle, mutta se on käytettävissä muuttuvalle listalle.
```

1.2. Tarkasta, onko lista tyhjä tai null. [Ratkaisu](ratkaisut/lista.kt). Lisätietoa: [isNullOrEmpty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/is-null-or-empty.html), [null safety](https://kotlinlang.org/docs/null-safety.html#safe-calls)

```
Opittua: Kotlinissa kokoelmilla on isNullOrEmpty-funktio, jonka avulla voi tehdä null- ja tyhjän arvon tarkastuksen. 

Lisäksi voi käyttää turvallisen kutsun operaattoria ?.
```

## 2. Taulukko

2.1 Luo taulukko ja lisää elementtejä taulukkoon. [Ratkaisu](ratkaisut/taulukko.kt). Lisätietoa: [Array](https://kotlinlang.org/docs/basic-types.html#arrays)

```
Opittua: Kotlinin taulukoita edustaa Array-luokka. Kotlinin taulukot ovat kiinteän kokoisia, 
joten kun taulukko on luotu, et voi muuttaa taulukon kokoa. 
Käytä muuttuvaa listaa, jos tarvitset muuttuvan taulukon.
```

2.2. Tarkasta, onko taulukko lajiteltu. [Ratkaisu](ratkaisut/taulukko.kt). Lisätietoa: [asList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/as-list.html), [sorted](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted.html)

```
Opittua: Taulukon voi muuntaa listaksi Collectionin asList-funktiolla. Sorted-funktio palauttaa listan järjestettynä.
```

2.3. Tarkasta, onko taulukossa kaksoiskappaleita. [Ratkaisu](ratkaisut/taulukko.kt). Lisätietoa: [distict](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/distinct.html)

```
Opittua: Kotlinilla on distinct-funktio, joka palauttaa listan taulukossa olevista erillisistä elementeistä.
```