package u0;
public final class a {
    public int f44963a;
    public int f44964b;
    public float f44965c;
    public float d;
    public long e;
    public long f44966f;
    public long f44967g;
    public float h;
    public int f44968i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f44967g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f44968i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f44963a, 0.0f, 1.0f) * 0.5f;
    }
}
