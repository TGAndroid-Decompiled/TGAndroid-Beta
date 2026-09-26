package pg;
public final class t1 {
    public int f41265a;
    public float f41266b;
    public float f41267c;

    public t1(float f7, float f10, int i10) {
        this.f41265a = i10;
        this.f41266b = f7;
        this.f41267c = f10;
    }

    public final Object clone() {
        return new t1(this.f41266b, this.f41267c, this.f41265a);
    }
}
