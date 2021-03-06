package com.ebook.chapter03.designpattern.behavioral.chain;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*****
 * @Author zean
 * Created at 2018/4/23
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ChainTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        SupportHandler supportHandler = RequestorChainFactory.getHandlerChain();
        supportHandler.receiveRequest(SupportHandler.TECHNICAL,"technical level message");

        System.err.println("\n**********\n");
        supportHandler.receiveRequest(SupportHandler.BILLING,"billing level message");

        System.err.println("\n**********\n");

        supportHandler.receiveRequest(SupportHandler.GENERAL,"general level message");
    }
}
