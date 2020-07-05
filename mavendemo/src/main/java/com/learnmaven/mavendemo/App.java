package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Calculator calc = new Calculator();
        LOGGER.debug(calc.add(1, 2));
        LOGGER.debug(calc.subtract(4, 3));
        LOGGER.debug(calc.multiply(10, 10));
        LOGGER.debug(calc.divide(100, 10));
    }
}
