package u0;
public final class a {
    public int f48238a;
    public int f48239b;
    public float f48240c;
    public float d;
    public long f48241e;
    public long f48242f;
    public long f48243g;
    public float h;
    public int f48244i;

    public final float a(long j10) {
        long j11 = this.f48241e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f48243g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f48244i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f48238a, 0.0f, 1.0f) * 0.5f;
    }
}
