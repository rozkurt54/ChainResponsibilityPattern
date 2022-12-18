package org.example;

import org.example.logger.abstracts.AbstractLogger;
import org.example.logger.concretes.ConsoleLogger;
import org.example.logger.concretes.ErrorLogger;
import org.example.logger.concretes.FileLogger;

public class Main {

  private static AbstractLogger getChainLogger() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }
  public static void main(String[] args) {

    AbstractLogger loggerChain = getChainLogger();

    loggerChain.logMessage(AbstractLogger.INFO, "Bu bir info mesajıdır.");
    loggerChain.logMessage(AbstractLogger.DEBUG, "Bu bir debug mesajıdır");
    loggerChain.logMessage(AbstractLogger.ERROR, "Bu bir error mesajıdır");

  }
}