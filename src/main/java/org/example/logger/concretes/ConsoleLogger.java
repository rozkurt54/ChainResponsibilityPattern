package org.example.logger.concretes;

import org.example.logger.abstracts.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("ConsoleLogger::Logger : " + message);
  }

}
