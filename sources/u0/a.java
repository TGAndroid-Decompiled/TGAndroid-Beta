package u0;
public final class a {
    public int f48933a;
    public int f48934b;
    public float f48935c;
    public float d;
    public long f48936e;
    public long f48937f;
    public long f48938g;
    public float h;
    public int f48939i;

    public final float a(long j10) {
        long j11 = this.f48936e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f48938g;
        if (j12 >= 0 && j10 >= j12) {
            float f9 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f48939i, 0.0f, 1.0f) * f9) + (1.0f - f9);
        }
        return d.b(((float) (j10 - j11)) / this.f48933a, 0.0f, 1.0f) * 0.5f;
    }
}
