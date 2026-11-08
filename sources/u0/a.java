package u0;
public final class a {
    public int f56156a;
    public int f56157b;
    public float f56158c;
    public float d;
    public long f56159e;
    public long f56160f;
    public long f56161g;
    public float h;
    public int f56162i;

    public final float a(long j3) {
        long j10 = this.f56159e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56161g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56162i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56156a, 0.0f, 1.0f) * 0.5f;
    }
}
