package u0;
public final class a {
    public int f43271a;
    public int f43272b;
    public float f43273c;
    public float d;
    public long e;
    public long f43274f;
    public long f43275g;
    public float h;
    public int f43276i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43275g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43276i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43271a, 0.0f, 1.0f) * 0.5f;
    }
}
