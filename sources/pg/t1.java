package pg;
public final class t1 {
    public int f44631a;
    public float f44632b;
    public float f44633c;

    public t1(float f7, float f10, int i10) {
        this.f44631a = i10;
        this.f44632b = f7;
        this.f44633c = f10;
    }

    public final Object clone() {
        return new t1(this.f44632b, this.f44633c, this.f44631a);
    }
}
