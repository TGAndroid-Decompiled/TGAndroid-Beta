package u0;
public final class a {
    public int f47665a;
    public int f47666b;
    public float f47667c;
    public float d;
    public long e;
    public long f47668f;
    public long f47669g;
    public float h;
    public int f47670i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47669g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47670i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47665a, 0.0f, 1.0f) * 0.5f;
    }
}
