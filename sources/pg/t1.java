package pg;
public final class t1 {
    public int f41266a;
    public float f41267b;
    public float f41268c;

    public t1(float f7, float f10, int i10) {
        this.f41266a = i10;
        this.f41267b = f7;
        this.f41268c = f10;
    }

    public final Object clone() {
        return new t1(this.f41267b, this.f41268c, this.f41266a);
    }
}
