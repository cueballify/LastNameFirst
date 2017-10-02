/*
 * Copyright (C) 2017 Diego Trujillo <diego.trujillo@alumni.nmt.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lastnamefirst;

import java.util.Scanner;

/**
 *
 * @author Diego Trujillo <diego.trujillo@alumni.nmt.edu>
 */
public class LastNameFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineSeparator = System.getProperty("line.separator");
        scanner.useDelimiter(lineSeparator);
        
        System.out.println("Enter a Full name in the format of FIRST MIDDLE LAST");
        String input = scanner.next();
        
        System.out.println("you entered: "+input);
        
        String first = input.substring(0, input.indexOf(" "));
        System.out.println("First: "+first);
        
        // crop the first name out, leaving middle and last
        input = input.substring(input.indexOf(" ")+1, input.length());
        
        //build new string and choose up to first space
        String middle = input.substring(0, input.indexOf(" "));
        System.out.println("Middle: "+middle);
        
        //build new string and choose after first space to end of string
        String last = input.substring(input.indexOf(" ")+1, input.length());
        System.out.println("last: "+last);
        
        System.out.println(last+", "+first+" "+middle.substring(0,1));
    }
    
}
