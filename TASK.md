# "*Userdata*" - Taskdescription

## Einführung
Das Beispiel soll eine einfache Verwendung von bestehendem Java-Code für ein Web-Deployment schulen.

## Ziele
Die einfache Umsetzung einer Benutzerverwaltung soll mittels Web-Applikation für Zugriffe von außen bereitgestellt werden. Dabei soll die Verwendung eines Web-Frameworks geschult werden. Die Trennung der Anzeige und Bearbeitung mittels geeigneten Patterns soll ebenfalls trainiert werden.

## Voraussetzungen
* Grundverständnis von Java
* Grundverständnis von Web-Framework Implementierung
* Lesen und Umsetzen von APIs
* Automatisiertes Testen mittels Unit- und System-Tests

## Detailierte Ausgabenbeschreibung
Erstelle eine Web-Applikation, welche eine einfache Benutzerverwaltung implementiert. Benutze dabei das Spring-Boot Beispiel *CRUD UI with Vaadin*, das im [src-Ordner](./src) schon als Gerüst lauffähig ist. Erweitere den Benutzer um die Attribute Email und Geburtsdatum und wähle entsprechende Datentypen. Der Administrator soll nur valide Emails und Geburtsdaten eingeben können und bei fehlerhafter Eingabe auf den entsprechenden Fehler hingewiesen werden. Das Datum kann zusätzlich mittels eines *Date-Pickers* ausgewählt werden.

Vergesse nicht auf das Testen der Grundfunktionalität und bedenke, dass die Daten derzeit nicht dauerhaft gespeichert werden. Ermögliche eine dauerhafte Persistierung und passe den bestehenden Code und die Konfiguration entsprechend an.

Der Code wird mittels ``gradle bootRun`` und ``gradle test`` auf entsprechende Funktionalität überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Dokumentation eines einfachen Benutzerverzeichnisses
- [x] Erweiterung des bestehenden Codes mit den Elementen Email (verpflichtend) und Geburtsdatum (optional)
- [x] Persistierung der Daten in einem dateibasierten Datenbanksystems (z.B. Sqlite)

### Grundanforderungen **zur Gänze erfüllt**
- [x] Validierung der Eingabe von Email (gültige Addresse) und Geburtsdatum (Vergangenheit)
- [x] Schreiben einer sprechenden Fehlermeldung im UserInterface
- [ ] Test der funktionalen Anforderungen (Anzeige, Einfügen, Löschen und Updaten)

## Quellen
* "Vaadin - Components and tools for building web apps in Java" zuletzt besucht am 2019-04-25; [online](https://vaadin.com/)
* "Creating CRUD UI with Vaadin"; SpringBoot Guides; zuletzt besucht am 2019-04-25; [online](https://spring.io/guides/gs/crud-with-vaadin/)
* "Spring Boot With SQLite"; zuletzt besucht am 2019-04-25; [online](https://www.baeldung.com/spring-boot-sqlite)
* "H2 Database Engine Cheat Sheet" zuletzt besucht am 2019-04-25; [online](http://www.h2database.com/html/cheatSheet.html)
* "Testing the Web Layer"; SpringBoot Guides; zuletzt besucht am 2019-04-08; [online](https://spring.io/guides/gs/testing-web/)
* "Testing the UI without a browser"; Vaadin blog; zuletzt besucht am 2019-04-25; [online](https://vaadin.com/blog/testing-the-ui-without-a-browser)
* "Vaadin Server-Side Browserless Containerless Testing"; Karibu; zuletzt besucht am 2019-04-25; [online](https://github.com/mvysny/karibu-testing#vaadin-browserless-testing)
