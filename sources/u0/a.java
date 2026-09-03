package u0;
public final class a {
    public int f45025a;
    public int f45026b;
    public float f45027c;
    public float d;
    public long e;
    public long f45028f;
    public long f45029g;
    public float h;
    public int f45030i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f45029g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f45030i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f45025a, 0.0f, 1.0f) * 0.5f;
    }
}
