package VisitorPattern2;

public class DomesticShippingVisitor implements FurnishingType{
    private static final double transferAllUnit = 350.0;
    private static final double transferAllSize = 230.0;
    private static final double transferAllDistance = 150.0;
    private static final double transferAllMass = 55.0;
    private static final double transferAllStandard = 60.0;

    @Override
    public double computeShippingFee(Fan fan) {
        return fan.getPoundage() * transferAllUnit;
    }
    @Override
    public double computeShippingFee(Sofa sofa) {
        return sofa.getExtent() * transferAllSize;
    }
    @Override
    public double computeShippingFee(Bed bed) {
        return bed.getDistance() * transferAllDistance;
    }
    @Override
    public double computeShippingFee(Cabinet cabinet) {
        return cabinet.getWidth() * transferAllMass;
    }
    @Override
    public double computeShippingFee(Mirror mirror) {
        return mirror.getQuality() * transferAllStandard;
    }
}
