package u0;
public final class a {
    public int f43605a;
    public int f43606b;
    public float f43607c;
    public float d;
    public long e;
    public long f43608f;
    public long f43609g;
    public float h;
    public int f43610i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43609g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43610i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43605a, 0.0f, 1.0f) * 0.5f;
    }
}
