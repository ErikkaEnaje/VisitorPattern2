package VisitorPattern2;

public class Sofa implements Furnishing {
    private double extent;

    public Sofa(double extent) {
        this.extent = extent;
    }
    public double getExtent() {
        return extent;
    }
    @Override
    public double accept(FurnishingType furnishingType) {
        return furnishingType.computeShippingFee(this);
    }
}
