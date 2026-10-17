package u0;
public final class a {
    public int f47242a;
    public int f47243b;
    public float f47244c;
    public float d;
    public long e;
    public long f47245f;
    public long f47246g;
    public float h;
    public int f47247i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47246g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47247i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47242a, 0.0f, 1.0f) * 0.5f;
    }
}
