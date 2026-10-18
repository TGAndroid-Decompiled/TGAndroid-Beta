package u0;
public final class a {
    public int f47217a;
    public int f47218b;
    public float f47219c;
    public float d;
    public long e;
    public long f47220f;
    public long f47221g;
    public float h;
    public int f47222i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f47221g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f47222i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f47217a, 0.0f, 1.0f) * 0.5f;
    }
}
