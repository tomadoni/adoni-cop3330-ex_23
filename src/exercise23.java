import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    String isSilent="";
	    System.out.println("Is the car silent when you turn on the key? (y or n)");
	    isSilent= kb.nextLine();
        if(isSilent.equals("y")){
            String isCorroded="";
            System.out.println("Are the battery terminals corroded? (y or n)");
            isCorroded= kb.nextLine();
            if(isCorroded.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            String isSlicking="";
            System.out.println("Does the car make a slicking noise? (y or n)");
            isSlicking= kb.nextLine();
            if(isSlicking.equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                String isCrank="";
                System.out.println("Does the car crank up but fail to start? (y or n)");
                isCrank= kb.nextLine();
                if(isCrank.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    String isDead="";
                    System.out.println("Does the engine start and then die? (y or n)");
                    isDead= kb.nextLine();
                    if(isDead.equals("y")){
                        String isInjection="";
                        System.out.println("Does your car have fuel injection? (y or n)");
                        isInjection= kb.nextLine();
                        if(isInjection.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
