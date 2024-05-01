package VisitorPattern2;

public class ImagineYourHome {
    public static void main(String[] args) {

        Fan fan = new Fan(550);
        Sofa sofa = new Sofa(800);
        Bed bed = new Bed(750);
        Cabinet cabinet = new Cabinet(500);
        Mirror mirror = new Mirror(980);


        FurnishingType domesticShippingVisitor = new DomesticShippingVisitor();

        double fanShipCharge = fan.accept(domesticShippingVisitor);
        double sofaShipCharge = sofa.accept(domesticShippingVisitor);
        double bedShipCharge = bed.accept(domesticShippingVisitor);
        double cabinetShipCharge = cabinet.accept(domesticShippingVisitor);
        double mirrorShipCharge = mirror.accept(domesticShippingVisitor);

        System.out.println("\n\t\t~~~Welcome to E-Commerce Webiste of ImagineYourHome~~~");

        System.out.println("\nFOR SOFA");
        System.out.println("\nThe Freight extent for sofa based on the quantity: $" + sofaShipCharge);
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nFOR DESK");
        System.out.println("\nThe Transport width for bed based on the distant: $" + bedShipCharge);
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nFOR CABINET");
        System.out.println("\nThe Delivery mass for cabinet based on the width to ship: $" + cabinetShipCharge);
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nFOR FAN");
        System.out.println("\nThe Carriage poundage for fan based on the weight: $" +fanShipCharge);
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nFOR Mirror");
        System.out.println("\nThe Carriage quality for fan based on the standard: $" +mirrorShipCharge);
    }
}
