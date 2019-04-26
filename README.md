# "*Userdata*"

## Aufgabenstellung
Die detaillierte [Aufgabenstellung](TASK.md) beschreibt die notwendigen Schritte zur Realisierung.

## Implementierung

#### Add Vaadin DatePicker

To use the DatePicker from Vaadin you need to add this to the `build.gradle` dependencies.

```
compile group: 'com.vaadin', name: 'vaadin-date-picker-flow', version: '1.3.0'
```

#### Vaadin validation

To validate inputs in Vaadin you use the `binder` object. The binder object is responsible for the mapping from UI to Object and the other way around. You can also specify validators like this:

This uses an already existing Validator (`EmailValidator`) the argument pasted to it is the error message.

```java
// Sets a validation for the email TextField.
binder.forField(email)
    .withValidator(new EmailValidator("This doesn't look like a valid email address"))
    .bind(Customer::getEmail, Customer::setEmail);
```

This uses a lambda function that results into an boolean. If true the validation pasted if it returns false the error message is displayed.

```java
// Sets a validator for the birthday DatePicker
binder.forField(birthday)
    .withValidator(date -> date == null || date.isBefore(LocalDate.now()), "Birthday must be before today")
    .bind(Customer::getBirthday, Customer::setBirthday);
```

#### Vaadin check validation

```java
void save() {
    try {
        binder.writeBean(customer);
        repository.save(customer);
        changeHandler.onChange();
    } catch (ValidationException e) {

    }
}
```

This code tries to save the values into the `customer` object. This intern runs all validators and throws the `ValidationException`. In that way we don't save the object if a validation fails.

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
* [Vaadin DatePicker](<https://vaadin.com/components/vaadin-date-picker/install>)
* [Vaadin Validierung](https://vaadin.com/docs/v13/flow/binding-data/tutorial-flow-components-binder.html)
* [Vaadin check validation](<https://vaadin.com/docs/v13/flow/binding-data/tutorial-flow-components-binder.html>)
* [H2 not persistent](https://stackoverflow.com/a/47913056)