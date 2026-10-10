package pg;
public final class s1 {
    public int f45822a;
    public float f45823b;
    public float f45824c;

    public s1(float f7, float f10, int i10) {
        this.f45822a = i10;
        this.f45823b = f7;
        this.f45824c = f10;
    }

    public final Object clone() {
        return new s1(this.f45823b, this.f45824c, this.f45822a);
    }
}
