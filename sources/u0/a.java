package u0;
public final class a {
    public int f56067a;
    public int f56068b;
    public float f56069c;
    public float d;
    public long f56070e;
    public long f56071f;
    public long f56072g;
    public float h;
    public int f56073i;

    public final float a(long j3) {
        long j10 = this.f56070e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f56072g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f56073i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f56067a, 0.0f, 1.0f) * 0.5f;
    }
}
