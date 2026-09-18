package pg;
public final class s1 {
    public int f41242a;
    public float f41243b;
    public float f41244c;

    public s1(float f7, float f10, int i10) {
        this.f41242a = i10;
        this.f41243b = f7;
        this.f41244c = f10;
    }

    public final Object clone() {
        return new s1(this.f41243b, this.f41244c, this.f41242a);
    }
}
