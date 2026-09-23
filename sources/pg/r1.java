package pg;
public final class r1 {
    public int f40927a;
    public float f40928b;
    public float f40929c;

    public r1(float f7, float f10, int i10) {
        this.f40927a = i10;
        this.f40928b = f7;
        this.f40929c = f10;
    }

    public final Object clone() {
        return new r1(this.f40928b, this.f40929c, this.f40927a);
    }
}
