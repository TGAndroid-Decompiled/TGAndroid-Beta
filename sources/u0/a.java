package u0;
public final class a {
    public int f58244a;
    public int f58245b;
    public float f58246c;
    public float d;
    public long f58247e;
    public long f58248f;
    public long f58249g;
    public float h;
    public int f58250i;

    public final float a(long j3) {
        long j10 = this.f58247e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58249g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58250i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58244a, 0.0f, 1.0f) * 0.5f;
    }
}
