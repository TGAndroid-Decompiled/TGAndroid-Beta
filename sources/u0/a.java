package u0;
public final class a {
    public int f49805a;
    public int f49806b;
    public float f49807c;
    public float d;
    public long e;
    public long f49808f;
    public long f49809g;
    public float h;
    public int f49810i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f49809g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (e.b(((float) (j10 - j12)) / this.f49810i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return e.b(((float) (j10 - j11)) / this.f49805a, 0.0f, 1.0f) * 0.5f;
    }
}
