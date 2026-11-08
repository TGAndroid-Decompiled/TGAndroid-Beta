package u0;
public final class a {
    public int f56155a;
    public int f56156b;
    public float f56157c;
    public float d;
    public long f56158e;
    public long f56159f;
    public long f56160g;
    public float h;
    public int f56161i;

    public final float a(long j3) {
        long j10 = this.f56158e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56160g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56161i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56155a, 0.0f, 1.0f) * 0.5f;
    }
}
