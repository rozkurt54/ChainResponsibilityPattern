package org.example.logger.concretes;

import org.example.logger.abstracts.AbstractLogger;

public class FileLogger extends AbstractLogger {

  public FileLogger(int level) {
    this.level=level;
  }

  @Override
  protected void write(String message) {
    System.out.println("FileLogger::write: " + message);
  }
}
