package com.ebook.chapter03.designpattern.creational.abstractfactory;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

public class WinButton implements Button {

    @Override
    public void paint() {
        System.err.println("this is windows Button");
    }
}
