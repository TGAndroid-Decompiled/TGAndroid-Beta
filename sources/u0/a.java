package u0;
public final class a {
    public int f42242a;
    public int f42243b;
    public float f42244c;
    public float d;
    public long e;
    public long f42245f;
    public long f42246g;
    public float h;
    public int f42247i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f42246g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f42247i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f42242a, 0.0f, 1.0f) * 0.5f;
    }
}
