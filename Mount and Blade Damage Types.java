import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        //Damage taken and armor
        double armor=50;
        double base_damage=50;
        //Damagetype
        double armor_soak_factor=0.8;
        double armor_reduction_factor=1;

        //loop forever
        int i=1;
        while (i==1)
        {
            //Ask for damage type
            System.out.print("What damage type? (b, p, c): ");
            String damage_type = scan.next();
            //Adjust damage depending on type.
            if("c".equals(damage_type))
            {
                armor_soak_factor=0.8;
                armor_reduction_factor=1;
            }
            else if ("p".equals(damage_type))
            {
                armor_soak_factor=0.65;
                armor_reduction_factor=0.5;
            }
            else if ("b".equals(damage_type))
            {
                armor_soak_factor=0.5;
                armor_reduction_factor=0.75;
            }
            else if ("exit".equals(damage_type))//secret "exit' cheatcode
            {
                i=2;
                System.out.println("we out");
            }
            else
            {
            System.out.println("ERROR: Wrong damage type entered. Must be b, p, or c.");
            }
            
            //Damage calculations
            double reduced_damage = base_damage - (armor * armor_soak_factor);
            double final_damage =  reduced_damage * (1 -  (armor/100 * armor_reduction_factor));
            if (final_damage<=0)final_damage=0;
        
            //write to screen
            //System.out.println("You take " + Math.round(final_damage) + " damage!");
            //Testing stuff
            System.out.println("You take " + final_damage + " damage!");
        }
    }
}
