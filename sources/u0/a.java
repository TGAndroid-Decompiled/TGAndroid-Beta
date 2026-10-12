package u0;
public final class a {
    public int f45835a;
    public int f45836b;
    public float f45837c;
    public float d;
    public long e;
    public long f45838f;
    public long f45839g;
    public float h;
    public int f45840i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f45839g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f45840i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f45835a, 0.0f, 1.0f) * 0.5f;
    }
}
