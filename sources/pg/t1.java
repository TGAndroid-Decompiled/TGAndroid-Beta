package pg;
public final class t1 {
    public int f44638a;
    public float f44639b;
    public float f44640c;

    public t1(float f7, float f10, int i10) {
        this.f44638a = i10;
        this.f44639b = f7;
        this.f44640c = f10;
    }

    public final Object clone() {
        return new t1(this.f44639b, this.f44640c, this.f44638a);
    }
}
