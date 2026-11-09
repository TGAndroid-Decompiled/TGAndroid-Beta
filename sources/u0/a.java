package u0;
public final class a {
    public int f56168a;
    public int f56169b;
    public float f56170c;
    public float d;
    public long f56171e;
    public long f56172f;
    public long f56173g;
    public float h;
    public int f56174i;

    public final float a(long j3) {
        long j10 = this.f56171e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56173g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56174i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56168a, 0.0f, 1.0f) * 0.5f;
    }
}
