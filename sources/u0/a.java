package u0;
public final class a {
    public int f58275a;
    public int f58276b;
    public float f58277c;
    public float d;
    public long f58278e;
    public long f58279f;
    public long f58280g;
    public float h;
    public int f58281i;

    public final float a(long j3) {
        long j10 = this.f58278e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58280g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58281i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58275a, 0.0f, 1.0f) * 0.5f;
    }
}
