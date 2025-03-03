try {
  // ...
} catch (SecurityException se) {
  System.err.println(se);
  // Recover from exception
}
} catch(SecurityException se) {
  logger.log(Level.SEVERE, se);
