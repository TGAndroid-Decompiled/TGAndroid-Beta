package u0;
public final class a {
    public int f47226a;
    public int f47227b;
    public float f47228c;
    public float d;
    public long e;
    public long f47229f;
    public long f47230g;
    public float h;
    public int f47231i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47230g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47231i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47226a, 0.0f, 1.0f) * 0.5f;
    }
}
