package Template;

public class IPhoneCompiler extends CrossCompiler {
  protected void collectSource() {
	  System.out.println("IOS");
  }
  protected void compileToTarget() {
	  System.out.println("IPhone");
  }
}