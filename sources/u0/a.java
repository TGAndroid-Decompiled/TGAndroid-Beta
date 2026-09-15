package u0;
public final class a {
    public int f43275a;
    public int f43276b;
    public float f43277c;
    public float d;
    public long e;
    public long f43278f;
    public long f43279g;
    public float h;
    public int f43280i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43279g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43280i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43275a, 0.0f, 1.0f) * 0.5f;
    }
}
