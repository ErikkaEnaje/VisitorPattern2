package VisitorPattern2;

public class Cabinet implements Furnishing{
    private double width;
    public Cabinet(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double accept(FurnishingType furnishingType) {
        return furnishingType.computeShippingFee(this);
    }
}
