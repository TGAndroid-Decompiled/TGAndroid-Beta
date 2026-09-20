package pg;
public final class s1 {
    public int f41283a;
    public float f41284b;
    public float f41285c;

    public s1(float f7, float f10, int i10) {
        this.f41283a = i10;
        this.f41284b = f7;
        this.f41285c = f10;
    }

    public final Object clone() {
        return new s1(this.f41284b, this.f41285c, this.f41283a);
    }
}
