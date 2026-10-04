package u0;
public final class a {
    public int f47167a;
    public int f47168b;
    public float f47169c;
    public float d;
    public long f47170e;
    public long f47171f;
    public long f47172g;
    public float h;
    public int f47173i;

    public final float a(long j3) {
        long j10 = this.f47170e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f47172g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f47173i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f47167a, 0.0f, 1.0f) * 0.5f;
    }
}
