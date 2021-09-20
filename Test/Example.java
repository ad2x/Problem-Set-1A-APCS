//Alexander Double
//September 20th 2021
//Problem Set 1-A

import java.util.Scanner;

class Example {
    public static void main (String[]args){
        System.out.println("Choose a formula");
        System.out.println("    1) Quadratic Formula");
        System.out.println("    2) Slope");
        System.out.println("    3) Midpoint");
        System.out.println("    4) Sum of Arithmetic Series");
        System.out.println("    5) Sum of Gemetric Series");
        
        //== Select Formula ==
        Scanner select = new Scanner(System.in);
        int choice = select.nextInt();
        
        switch(choice) {
            case 1:
                //Quadratic Formula    
                Scanner quadf_a = new Scanner(System.in);
                Scanner quadf_b = new Scanner(System.in);
                Scanner quadf_c = new Scanner(System.in);
            
                System.out.println("Input a:");
                double quadf_a_ = quadf_a.nextDouble();
                System.out.println("Input b:");
                double quadf_b_ = quadf_b.nextDouble();
                System.out.println("Input c");
                double quadf_c_ = quadf_c.nextDouble();
        
                //Roots for +/-
                double mquadfroot = (Math.sqrt(Math.pow(quadf_b_, 2) - 4*quadf_a_*quadf_c_) - quadf_b_)/2*quadf_a_;
                double pquadfroot = (Math.sqrt(Math.pow(quadf_b_, 2) - 4*quadf_a_*quadf_c_) + quadf_b_)/2*quadf_a_;
                
                System.out.println("Roots for a = " + quadf_a_ + ", b = " + quadf_b_ + ", c = " + quadf_c_ + ": " + mquadfroot + "(-), " + pquadfroot + "(+)");
                
                break;
            case 2:
                //Slope
                Scanner x1_ = new Scanner(System.in);
                Scanner y1_ = new Scanner(System.in);
                Scanner x2_ = new Scanner(System.in);
                Scanner y2_ = new Scanner(System.in);
                
                System.out.println("Input x1:");
                double x1 = x1_.nextDouble();
                System.out.println("Input y1:");
                double y1 = y1_.nextDouble();
                System.out.println("Input x2:");
                double x2 = x2_.nextDouble();
                System.out.println("Input y2:");
                double y2 = y2_.nextDouble();
                
                //Slope calc
                double slopeval = (y2 - y1)/(x2 - x1);
                
                System.out.println("Slope for points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "  ): " + slopeval);
                
                break;
            case 3: 
                //Midpoint
                //I took the variables from slope and added an underscore to them
                Scanner _x1_ = new Scanner(System.in);
                Scanner _y1_ = new Scanner(System.in);
                Scanner _x2_ = new Scanner(System.in);
                Scanner _y2_ = new Scanner(System.in);
                
                System.out.println("Input x1:");
                double _x1 = _x1_.nextDouble();
                System.out.println("Input y1:");
                double _y1 = _y1_.nextDouble();
                System.out.println("Input x2:");
                double _x2 = _x2_.nextDouble();
                System.out.println("Input y2:");
                double _y2 = _y2_.nextDouble();
                
                //Midpoint calc
                double midpointvalx = (_x1 + _x2)/2;
                double midpointvaly = (_y1 + _y2)/2;
                
                System.out.println("Midpoint for points (" + _x1 + ", " + _y1 + "), (" + _x2 + ", " + _y2 + "  ): (" + midpointvalx + ", " + midpointvaly + ")");
                
                break;
            case 4: 
                //Sum of arithmetic series
                Scanner nterms = new Scanner(System.in);
                Scanner nthterm = new Scanner(System.in);
                Scanner firstterm = new Scanner(System.in);
                
                System.out.println("Input # of terms:");
                double nterms_ = nterms.nextDouble();
                System.out.println("Input nth/last term:");
                double nthterm_ = nthterm.nextDouble();
                System.out.println("Input first term");
                double firstterm_ = firstterm.nextDouble();
                
                //Arithmetic series calc
                double arithsum = nterms_/2*(nthterm_ + firstterm_);
                
                System.out.println("Sum of arithmetic series with " + nterms_ + " terms, the first of which being " + firstterm_ + " and the last being " + nthterm_ + " is " + arithsum);
        }
    }
}