## Do zrobienia przed podejściem do zadania
   * Stworzyć w Postgres bazę danych o nazwie springboot_hirely_exam_db,
   * W `main/resources/application.properties` podaj hasło do niej.
## Zadanie
### Opis
Chcemy napisać aplikację webową dla firmy kolejowej. 
   * Mamy rozpoczęty i skonfigurowany projekt z mavenem zawierający zależności do spock, hibernate, spring,
   * Jest dodany skrypt flyway inicjalizujący schemat bazu danych i generujący przykładowe dane,
   * Istnieje encja `Train` zawierająca: `id`, `name`, `purchaseDate`, `type` (enum: [`PASSENGER`, `FREIGHT`]).
   * Pociąg towarowy zarabia dla firmy 15000 za każdy dzień pracy, jeśli ma dziesięć lub mniej lat. Jeśli pociąg towarowy jest starszy niż dziesięć lat, zarabia 70% tej kwoty.
   * Pociąg osobowy zarabia 10000 za każdy tydzień pracy.
   * Pociągi pracują tak samo każdego dnia.
### Zadania do wykonania
1. Dodać kilka przykładowych wpisów do bazy danych przy pomocy Flyway.
2. Stworzyć aplikację webową z architekturą trójwarstwową, która posiada następujące endpointy:
   * `GET /trains`, który zwróci wszystkie pociągi wraz informacją, ile który zarobił do dnia dzisiejszego,
   * `GET trains?type={type}`, który zwróci wszystkie pociągi danego typu wraz informacją, który ile zarobił do dnia dzisiejszego. Wykorzystaj query methods (naming query by convention) w repozytorium do wyszukiwania pojazdów danego typu z bazy danych.
3. Napisać po jednym teście dla każdej z warstw aplikacji.
### Zadanie do wykonania DLA CHĘTNYCH
1. Zaimplementuj  endpoint:
   * `GET /trains?type={type}&top={n}`, który zwróci TOP N najlepiej zarabiających pociągów danego typu.
## Podpowiedzi i uwagi:
1. Zarówno baza danych produkcyjna (dla działającej aplikacji) Postgres oraz baza testowa H2 są zarządzane przez Flyway. Dane w nich mogą się różnić i posiadają własne pliki SQL w katalogach main/resources i test/resources.
2. Jeśli masz problem z bazą danych lub Flyway i aplikacja się nie uruchamia, możesz ją skasować i stworzyć od nowa.
3. Projekt ma już skonfigurowany Maven, Spring Boot, Flyway i Spock wraz z Groovy. Pamiętaj o kliknięciu w dwie kręcące się strzałki, aby zaciągnąć zależności Mavena.
4. Projekt posiada już dwa testy. Upewniaj się regularnie, że nie przestały one działać.
5. Pamiętaj o użyciu odpowiedniego typu danych do obliczeń finansowych.
