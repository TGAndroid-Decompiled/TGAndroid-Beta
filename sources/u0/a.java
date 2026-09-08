package u0;
public final class a {
    public int f46605a;
    public int f46606b;
    public float f46607c;
    public float d;
    public long f46608e;
    public long f46609f;
    public long f46610g;
    public float h;
    public int f46611i;

    public final float a(long j3) {
        long j10 = this.f46608e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f46610g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f46611i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f46605a, 0.0f, 1.0f) * 0.5f;
    }
}
