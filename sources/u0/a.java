package u0;
public final class a {
    public int f56066a;
    public int f56067b;
    public float f56068c;
    public float d;
    public long f56069e;
    public long f56070f;
    public long f56071g;
    public float h;
    public int f56072i;

    public final float a(long j3) {
        long j10 = this.f56069e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56071g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56072i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56066a, 0.0f, 1.0f) * 0.5f;
    }
}
