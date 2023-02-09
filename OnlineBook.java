/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_1;

/**
 *
 * @author MANH
 */
public class OnlineBook extends Book{
    String doiLink;

    public OnlineBook(String doiLink, String bookName, String publisherName, int publisherYear, String authorName) {
        super(bookName, publisherName, publisherYear, authorName);
        this.doiLink = doiLink;
    }
  //da hinh trong khi chay RunTime (goi ham cung ten)
    
    public void setDoiLink(String doi)
    {
        this.doiLink = doi;
    }
    public  void showInfo()
    {
        System.err.println("This is a Online Book");
    }
}
