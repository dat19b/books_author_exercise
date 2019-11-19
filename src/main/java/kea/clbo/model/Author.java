package kea.clbo.model;

import java.util.HashSet;
import java.util.Set;


public class Author {

    private String firstName;
    private String lastName;

    private Set<Book> books  = new HashSet<>();
}
