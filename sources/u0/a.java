package u0;
public final class a {
    public int f48606a;
    public int f48607b;
    public float f48608c;
    public float d;
    public long f48609e;
    public long f48610f;
    public long f48611g;
    public float h;
    public int f48612i;

    public final float a(long j3) {
        long j10 = this.f48609e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48611g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48612i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48606a, 0.0f, 1.0f) * 0.5f;
    }
}
