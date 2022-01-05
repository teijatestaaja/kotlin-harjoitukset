# 100 harjoitusta

1. Luo lista ja lisää elementtejä listaan. [Ratkaisu](ratkaisut/lista.kt). Lisätietoa: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/), [Collections overview](https://kotlinlang.org/docs/collections-overview.html#collection)

```
Opittua: Kotlinissa on kaksi lista-tietorakennetta: List (muuttumaton lista) ja MutableList (muuttuva lista). add-funktio ei ole käytettävissä muuttumattomalle listalle, mutta se on käytettävissä muuttuvalle listalle.
```

2. Luo taulukko ja lisää elementtejä taulukkoon. [Ratkaisu](ratkaisut/taulukko.kt). Lisätietoa: [Array](https://kotlinlang.org/docs/basic-types.html#arrays)

```
Opittua: Kotlinin taulukoita edustaa Array-luokka. Kotlinin taulukot ovat kiinteän kokoisia, 
joten kun taulukko on luotu, et voi muuttaa taulukon kokoa. 
Käytä muuttuvaa listaa, jos tarvitset muuttuvan taulukon.
```

3. Tarkista, onko taulukko lajiteltu. [Ratkaisu](ratkaisut/taulukko.kt). Lisätietoa: [asList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/as-list.html), [sorted](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted.html)

```
Opittua: Taulukon voi muuntaa listaksi Collectionin asList-funktiolla. Sorted-funktio palauttaa listan järjestettynä.
```