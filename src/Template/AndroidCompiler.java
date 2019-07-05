package Template;


public class AndroidCompiler extends CrossCompiler {
  protected void collectSource() {
    System.out.println("Linux");
  }
  protected void compileToTarget() {
	System.out.println("Android");
  }
}