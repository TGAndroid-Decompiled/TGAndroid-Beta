package u0;
public final class a {
    public int f46606a;
    public int f46607b;
    public float f46608c;
    public float d;
    public long f46609e;
    public long f46610f;
    public long f46611g;
    public float h;
    public int f46612i;

    public final float a(long j3) {
        long j10 = this.f46609e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f46611g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f46612i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f46606a, 0.0f, 1.0f) * 0.5f;
    }
}
