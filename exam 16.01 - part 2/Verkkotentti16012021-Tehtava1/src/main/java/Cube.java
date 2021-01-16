public class Cube implements Measurable {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int summarizedSidesArea(){
       return this.edgeLength * this.edgeLength * 6;
    }

    public int objectVolume(){
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }
}
