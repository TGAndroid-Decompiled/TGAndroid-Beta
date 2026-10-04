package u0;
public final class a {
    public int f47176a;
    public int f47177b;
    public float f47178c;
    public float d;
    public long f47179e;
    public long f47180f;
    public long f47181g;
    public float h;
    public int f47182i;

    public final float a(long j3) {
        long j10 = this.f47179e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f47181g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f47182i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f47176a, 0.0f, 1.0f) * 0.5f;
    }
}
