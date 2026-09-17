package pg;
public final class q1 {
    public int f40992a;
    public float f40993b;
    public float f40994c;

    public q1(float f7, float f10, int i10) {
        this.f40992a = i10;
        this.f40993b = f7;
        this.f40994c = f10;
    }

    public final Object clone() {
        return new q1(this.f40993b, this.f40994c, this.f40992a);
    }
}
