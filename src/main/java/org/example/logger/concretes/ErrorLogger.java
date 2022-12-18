package org.example.logger.concretes;

import org.example.logger.abstracts.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("ErrorLogger::write: " + message );
  }
}
