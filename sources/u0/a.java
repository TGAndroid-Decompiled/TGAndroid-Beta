package u0;
public final class a {
    public int f48572a;
    public int f48573b;
    public float f48574c;
    public float d;
    public long f48575e;
    public long f48576f;
    public long f48577g;
    public float h;
    public int f48578i;

    public final float a(long j3) {
        long j10 = this.f48575e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48577g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48578i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48572a, 0.0f, 1.0f) * 0.5f;
    }
}
