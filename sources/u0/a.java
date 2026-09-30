package u0;
public final class a {
    public int f43561a;
    public int f43562b;
    public float f43563c;
    public float d;
    public long e;
    public long f43564f;
    public long f43565g;
    public float h;
    public int f43566i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43565g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43566i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43561a, 0.0f, 1.0f) * 0.5f;
    }
}
