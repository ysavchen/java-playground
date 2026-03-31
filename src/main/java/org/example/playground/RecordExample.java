package org.example.playground;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.requireNonNull;

public class RecordExample {

    sealed interface Employee permits Engineer, Manager {
    }

    record Engineer(String name) implements Employee {
    }

    record Manager(String name) implements Employee {
    }

    public static void main(String[] args) {
        // --- record for person data ---
        record Person(String name, String surname, int age) {
        }
        var person = new Person("John", "Doe", 45);
        System.out.println(person);
        System.out.println("Name: " + person.name);

        // --- record constructors ---
        record Country(String name, Set<String> cities) {

            // compact constructor for validation / normalization
            Country {
                requireNonNull(name);
                cities = Set.copyOf(cities);
            }

            // constructor with a default value for cities
            Country(String name) {
                this(name, new HashSet<>());
            }
        }
        var russia = new Country("Russia", new HashSet<>());
        var finland = new Country("Finland");

        // --- switch for sealed records ---
        Employee employee = new Engineer("John");
        System.out.println(work(employee));
    }

    public static String work(Employee employee) {
        return switch (employee) {
            case Engineer engineer -> "Do engineering";
            case Manager manager -> "Do people management";
        };
    }
}
