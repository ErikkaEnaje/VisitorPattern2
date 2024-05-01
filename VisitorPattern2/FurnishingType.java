package VisitorPattern2;

public interface FurnishingType {
    public double computeShippingFee(Fan fan);
    public double computeShippingFee(Sofa sofa);
    public double computeShippingFee(Bed bed);
    public double computeShippingFee(Cabinet cabinet);
    public double computeShippingFee(Mirror mirror);


}
