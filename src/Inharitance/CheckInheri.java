package Inharitance;

public class CheckInheri {

    public static void main(String[] args) {
        Kid kid=new Kid();
        System.out.println(kid.a);

        Kid  p=new Kid();
        System.out.println(p.overridden);


        Parent pa= new Kid();
        System.out.println(pa.overridden);

        Kid k= new Kid();
        System.out.println(k.overridden);



    }
}
