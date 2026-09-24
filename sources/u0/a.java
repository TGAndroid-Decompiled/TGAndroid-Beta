package u0;
public final class a {
    public int f43545a;
    public int f43546b;
    public float f43547c;
    public float d;
    public long e;
    public long f43548f;
    public long f43549g;
    public float h;
    public int f43550i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43549g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43550i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43545a, 0.0f, 1.0f) * 0.5f;
    }
}
