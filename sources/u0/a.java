package u0;
public final class a {
    public int f47183a;
    public int f47184b;
    public float f47185c;
    public float d;
    public long f47186e;
    public long f47187f;
    public long f47188g;
    public float h;
    public int f47189i;

    public final float a(long j3) {
        long j10 = this.f47186e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f47188g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f47189i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f47183a, 0.0f, 1.0f) * 0.5f;
    }
}
