package u0;
public final class a {
    public int f48713a;
    public int f48714b;
    public float f48715c;
    public float d;
    public long f48716e;
    public long f48717f;
    public long f48718g;
    public float h;
    public int f48719i;

    public final float a(long j3) {
        long j10 = this.f48716e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48718g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48719i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48713a, 0.0f, 1.0f) * 0.5f;
    }
}
