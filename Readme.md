# Testing.Mock

## Code Coverage

Quelldateien in `src/main/java` in Klasse `de.htwg.swen.DemoCoverage`

- VScode extension `Coverage Gutters` (https://marketplace.visualstudio.com/items?itemName=ryanluker.vscode-coverage-gutters) installieren

- *Terminal* in VScode öffnen
- Tests ausführen mit `mvn test` ggfalls `mvn clean test`
- Test Reports erzeugen mit `mvn jacoco:report`
- Öffnen der Reports im Browser mit `open target/site/jacoco/jacoco-sessions.html`
- Anzeige der Code Coverage in VScode: Öffnen des Produktionscode Klasse DemoCoverage - `de.htwg.swen.DemoCoverage`

## Mock Testing

- Mocking Framework Mockito unter https://site.mockito.org

- Quelldateien in `src/main/java` in Klasse `swen.testing.pzn.SearchPzn`
