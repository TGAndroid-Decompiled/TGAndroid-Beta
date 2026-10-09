package pg;
public final class s1 {
    public int f45776a;
    public float f45777b;
    public float f45778c;

    public s1(float f7, float f10, int i10) {
        this.f45776a = i10;
        this.f45777b = f7;
        this.f45778c = f10;
    }

    public final Object clone() {
        return new s1(this.f45777b, this.f45778c, this.f45776a);
    }
}
