package u0;
public final class a {
    public int f57666a;
    public int f57667b;
    public float f57668c;
    public float d;
    public long f57669e;
    public long f57670f;
    public long f57671g;
    public float h;
    public int f57672i;

    public final float a(long j3) {
        long j10 = this.f57669e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f57671g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f57672i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f57666a, 0.0f, 1.0f) * 0.5f;
    }
}
