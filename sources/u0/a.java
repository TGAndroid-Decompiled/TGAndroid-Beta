package u0;
public final class a {
    public int f47935a;
    public int f47936b;
    public float f47937c;
    public float d;
    public long f47938e;
    public long f47939f;
    public long f47940g;
    public float h;
    public int f47941i;

    public final float a(long j10) {
        long j11 = this.f47938e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47940g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47941i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f47935a, 0.0f, 1.0f) * 0.5f;
    }
}
