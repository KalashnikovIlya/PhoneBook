package org.example;

import junit.framework.Assert;
import org.junit.Test;

public class PhoneBookTest extends Assert {

    PhoneBook book = new PhoneBook();

    @Test
    public void arrayNotNull(){
        book.add("Иванов", "+8 800 2000 500");
        assertNotNull(book.phoneBook);
    }



}