package sg;
public final class i1 {
    public int f55093a;
    public float f55094b;
    public float f55095c;

    public i1(float f10, float f11, int i7) {
        this.f55093a = i7;
        this.f55094b = f10;
        this.f55095c = f11;
    }

    public final Object clone() {
        return new i1(this.f55094b, this.f55095c, this.f55093a);
    }
}
