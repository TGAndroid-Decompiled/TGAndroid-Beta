package pg;
public final class t1 {
    public int f44630a;
    public float f44631b;
    public float f44632c;

    public t1(float f7, float f10, int i10) {
        this.f44630a = i10;
        this.f44631b = f7;
        this.f44632c = f10;
    }

    public final Object clone() {
        return new t1(this.f44631b, this.f44632c, this.f44630a);
    }
}
