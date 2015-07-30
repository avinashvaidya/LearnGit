/**
 * 
 */
package com.myCode.main;
//Adding comment pankaj
import com.myCode.helper.NameValidator;

/**
 * @author AvinashVaidya
 *
 */
public class NameService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NameValidator nvalidator = new NameValidator();
		
		boolean validateName = nvalidator.validateMyName("test");
		
		System.out.println("validate status - " + validateName);
		
		
		
	}

}
