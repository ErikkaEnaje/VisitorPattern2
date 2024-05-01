package VisitorPattern2;

public class Mirror implements Furnishing {
    private double quality;
    public Mirror(double quality) {
        this.quality = quality;
    }
    public double getQuality() {
        return quality;
    }
    @Override
    public double accept(FurnishingType furnishingType) {
        return furnishingType.computeShippingFee(this);
    }
}

