package threadoperator;

public class JoinMessage implements Runnable {

  @Override
  public void run() {
    String importantInfo[] = {
        "Sleep",
        "Interrupt",
        "Join"
    };

    for (String s : importantInfo) {
      //Pause for 2 seconds
      Thread thread = Thread.currentThread();

      System.out.println(s);
    }
  }
}
