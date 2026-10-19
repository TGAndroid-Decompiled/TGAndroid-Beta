package u0;
public final class a {
    public int f47221a;
    public int f47222b;
    public float f47223c;
    public float d;
    public long e;
    public long f47224f;
    public long f47225g;
    public float h;
    public int f47226i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47225g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47226i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47221a, 0.0f, 1.0f) * 0.5f;
    }
}
