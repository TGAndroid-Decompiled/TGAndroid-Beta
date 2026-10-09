package u0;
public final class a {
    public int f48482a;
    public int f48483b;
    public float f48484c;
    public float d;
    public long f48485e;
    public long f48486f;
    public long f48487g;
    public float h;
    public int f48488i;

    public final float a(long j3) {
        long j10 = this.f48485e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48487g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48488i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48482a, 0.0f, 1.0f) * 0.5f;
    }
}
