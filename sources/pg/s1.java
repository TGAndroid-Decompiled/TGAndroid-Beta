package pg;
public final class s1 {
    public int f45812a;
    public float f45813b;
    public float f45814c;

    public s1(float f7, float f10, int i10) {
        this.f45812a = i10;
        this.f45813b = f7;
        this.f45814c = f10;
    }

    public final Object clone() {
        return new s1(this.f45813b, this.f45814c, this.f45812a);
    }
}
