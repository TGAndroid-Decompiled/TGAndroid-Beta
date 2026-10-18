package u0;
public final class a {
    public int f47267a;
    public int f47268b;
    public float f47269c;
    public float d;
    public long e;
    public long f47270f;
    public long f47271g;
    public float h;
    public int f47272i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47271g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47272i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47267a, 0.0f, 1.0f) * 0.5f;
    }
}
