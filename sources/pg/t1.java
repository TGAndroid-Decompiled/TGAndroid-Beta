package pg;
public final class t1 {
    public int f41251a;
    public float f41252b;
    public float f41253c;

    public t1(float f7, float f10, int i10) {
        this.f41251a = i10;
        this.f41252b = f7;
        this.f41253c = f10;
    }

    public final Object clone() {
        return new t1(this.f41252b, this.f41253c, this.f41251a);
    }
}
