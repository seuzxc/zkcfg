package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zean
 * Created at 2018/4/24
 * @Email zxc200706@hotmail.com
 *
 ****/

public class GeneralSupportHandler extends AbstractSupportHandler {

    public GeneralSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.err.println("general support handler: processing message " + message);
    }
}
