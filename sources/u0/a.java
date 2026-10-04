package u0;
public final class a {
    public int f47168a;
    public int f47169b;
    public float f47170c;
    public float d;
    public long f47171e;
    public long f47172f;
    public long f47173g;
    public float h;
    public int f47174i;

    public final float a(long j3) {
        long j10 = this.f47171e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f47173g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f47174i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f47168a, 0.0f, 1.0f) * 0.5f;
    }
}
