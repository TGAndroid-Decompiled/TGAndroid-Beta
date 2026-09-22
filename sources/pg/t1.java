package pg;
public final class t1 {
    public int f41314a;
    public float f41315b;
    public float f41316c;

    public t1(float f7, float f10, int i10) {
        this.f41314a = i10;
        this.f41315b = f7;
        this.f41316c = f10;
    }

    public final Object clone() {
        return new t1(this.f41315b, this.f41316c, this.f41314a);
    }
}
