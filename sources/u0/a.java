package u0;
public final class a {
    public int f43558a;
    public int f43559b;
    public float f43560c;
    public float d;
    public long e;
    public long f43561f;
    public long f43562g;
    public float h;
    public int f43563i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43562g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43563i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43558a, 0.0f, 1.0f) * 0.5f;
    }
}
