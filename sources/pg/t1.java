package pg;
public final class t1 {
    public int f41264a;
    public float f41265b;
    public float f41266c;

    public t1(float f7, float f10, int i10) {
        this.f41264a = i10;
        this.f41265b = f7;
        this.f41266c = f10;
    }

    public final Object clone() {
        return new t1(this.f41265b, this.f41266c, this.f41264a);
    }
}
