package pg;
public final class t1 {
    public int f41364a;
    public float f41365b;
    public float f41366c;

    public t1(float f7, float f10, int i10) {
        this.f41364a = i10;
        this.f41365b = f7;
        this.f41366c = f10;
    }

    public final Object clone() {
        return new t1(this.f41365b, this.f41366c, this.f41364a);
    }
}
