package pg;
public final class r1 {
    public int f45651a;
    public float f45652b;
    public float f45653c;

    public r1(float f7, float f10, int i10) {
        this.f45651a = i10;
        this.f45652b = f7;
        this.f45653c = f10;
    }

    public final Object clone() {
        return new r1(this.f45652b, this.f45653c, this.f45651a);
    }
}
