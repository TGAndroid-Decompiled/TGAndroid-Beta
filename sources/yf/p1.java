package yf;

public final class p1 {

    public int f50034a;

    public float f50035b;

    public float f50036c;

    public p1(float f10, float f11, int i10) {
        this.f50034a = i10;
        this.f50035b = f10;
        this.f50036c = f11;
    }

    public final Object clone() {
        return new p1(this.f50035b, this.f50036c, this.f50034a);
    }
}
