/**
 * Info about this package doing something for package-info.java file.
 * @since 1.0
 * @author mduszko
 * @version 1.1
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * @param someone the name of a person
  * @return greeting string
  */
  final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
