package u0;
public final class a {
    public int f56167a;
    public int f56168b;
    public float f56169c;
    public float d;
    public long f56170e;
    public long f56171f;
    public long f56172g;
    public float h;
    public int f56173i;

    public final float a(long j3) {
        long j10 = this.f56170e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56172g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56173i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56167a, 0.0f, 1.0f) * 0.5f;
    }
}
