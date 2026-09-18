package pg;
public final class q1 {
    public int f40997a;
    public float f40998b;
    public float f40999c;

    public q1(float f7, float f10, int i10) {
        this.f40997a = i10;
        this.f40998b = f7;
        this.f40999c = f10;
    }

    public final Object clone() {
        return new q1(this.f40998b, this.f40999c, this.f40997a);
    }
}
