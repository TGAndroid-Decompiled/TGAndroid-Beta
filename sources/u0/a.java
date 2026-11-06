package u0;
public final class a {
    public int f56042a;
    public int f56043b;
    public float f56044c;
    public float d;
    public long f56045e;
    public long f56046f;
    public long f56047g;
    public float h;
    public int f56048i;

    public final float a(long j3) {
        long j10 = this.f56045e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56047g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56048i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56042a, 0.0f, 1.0f) * 0.5f;
    }
}
