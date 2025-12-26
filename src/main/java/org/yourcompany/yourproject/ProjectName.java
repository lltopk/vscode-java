/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.math.BigDecimal;

import org.yourcompany.yourproject.entity.Book;


/**
 *
 * @author hasee
 */
public class ProjectName {

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("name");
        book.setPrice(BigDecimal.ONE);
        System.out.println("Hello World!");
        System.out.println(book);
        System.err.println(book.getName());
    }
}
