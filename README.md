# "*Userdata*"

## Aufgabenstellung
Die detaillierte [Aufgabenstellung](TASK.md) beschreibt die notwendigen Schritte zur Realisierung.

## Implementierung



#### H2 not persistent
You need to add this to the `application.properties`
````properties
spring.jpa.hibernate.ddl-auto = update
````
or
````properties
spring.jpa.hibernate.ddl-auto = validate
````

## Quellen
* [Vaadin Validierung](https://vaadin.com/docs/v13/flow/binding-data/tutorial-flow-components-binder.html)
* [H2 not persistent](https://stackoverflow.com/a/47913056)