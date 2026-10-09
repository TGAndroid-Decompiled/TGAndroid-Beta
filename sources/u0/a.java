package u0;
public final class a {
    public int f48480a;
    public int f48481b;
    public float f48482c;
    public float d;
    public long f48483e;
    public long f48484f;
    public long f48485g;
    public float h;
    public int f48486i;

    public final float a(long j3) {
        long j10 = this.f48483e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48485g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48486i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48480a, 0.0f, 1.0f) * 0.5f;
    }
}
