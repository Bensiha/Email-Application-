package emailapp;
//email application to create new email for new hires
public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John","Smith");
		
		em1.setAlternateEmail("ab@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
	}

}
