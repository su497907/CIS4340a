package trusted;
 
public class MixMatch {
  // ...
}
 
 
// In the same signed & sealed JAR file:
package trusted;
 
class RetValue {
  int getValue() {

import untrusted.RetValue;
 
public class MixMatch {
  private void privilegedMethod() throws IOException {
    try {
      final FileInputStream fis = AccessController.doPrivileged(
        new PrivilegedExceptionAction<FileInputStream>() {
          public FileInputStream run() throws FileNotFoundException {
            return new FileInputStream("file.txt");
          }
        }
      );
      try {
        RetValue rt = new RetValue();
 
        if (rt.getValue() == 1) {
          // Do something with sensitive file
        }
      } finally {
        fis.close();
      }
    } catch (PrivilegedActionException e) {
      // Forward to handler and log
    }
  }
 
  public static void main(String[] args) throws IOException {
    MixMatch mm = new MixMatch();
    mm.privilegedMethod();
  }
}
 
// In another JAR file:
package untrusted;
 
class RetValue {
  public int getValue() {

    return 1;
  }
}
