package pg;
public final class t1 {
    public int f41267a;
    public float f41268b;
    public float f41269c;

    public t1(float f7, float f10, int i10) {
        this.f41267a = i10;
        this.f41268b = f7;
        this.f41269c = f10;
    }

    public final Object clone() {
        return new t1(this.f41268b, this.f41269c, this.f41267a);
    }
}
