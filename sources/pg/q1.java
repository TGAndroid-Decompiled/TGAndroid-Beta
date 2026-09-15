package pg;
public final class q1 {
    public int f40970a;
    public float f40971b;
    public float f40972c;

    public q1(float f7, float f10, int i10) {
        this.f40970a = i10;
        this.f40971b = f7;
        this.f40972c = f10;
    }

    public final Object clone() {
        return new q1(this.f40971b, this.f40972c, this.f40970a);
    }
}
