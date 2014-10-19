package nuaa.action;

import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int i =5;
		System.out.println("nothing is good!");
		return SUCCESS;
	}
	
	public String test () throws Exception
	{
		System.out.println("TEST is good!");
		return SUCCESS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
