package VisitorPattern2;

public class Bed implements Furnishing{
    private double distance;
    public Bed(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
    }
    @Override
    public double accept(FurnishingType furnishingType) {
        return furnishingType.computeShippingFee(this);
    }
}
