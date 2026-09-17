package u0;
public final class a {
    public int f43298a;
    public int f43299b;
    public float f43300c;
    public float d;
    public long e;
    public long f43301f;
    public long f43302g;
    public float h;
    public int f43303i;

    public final float a(long j3) {
        long j10 = this.e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f43302g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f43303i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f43298a, 0.0f, 1.0f) * 0.5f;
    }
}
