package VisitorPattern2;

public class Fan implements Furnishing {
    private double poundage;

    public Fan(double poundage){
        this.poundage = poundage;
    }
    public double getPoundage() {
        return poundage;
    }
    @Override
    public double accept(FurnishingType furnishingType) {
        return furnishingType.computeShippingFee(this);
    }
}
