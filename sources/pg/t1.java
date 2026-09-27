package pg;
public final class t1 {
    public int f41263a;
    public float f41264b;
    public float f41265c;

    public t1(float f7, float f10, int i10) {
        this.f41263a = i10;
        this.f41264b = f7;
        this.f41265c = f10;
    }

    public final Object clone() {
        return new t1(this.f41264b, this.f41265c, this.f41263a);
    }
}
