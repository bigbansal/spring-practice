package com.mkyong.hashing;

import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );

        GroovyShell shell = new GroovyShell();
        final Object e = shell.evaluate(new File(".\\java-project\\src\\main\\java\\com\\mkyong\\hashing\\hello_world.groovy"));
        System.out.println(e);

    }
}
