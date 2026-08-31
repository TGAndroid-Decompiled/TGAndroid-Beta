package u0;
public final class a {
    public int f48202a;
    public int f48203b;
    public float f48204c;
    public float d;
    public long f48205e;
    public long f48206f;
    public long f48207g;
    public float h;
    public int f48208i;

    public final float a(long j10) {
        long j11 = this.f48205e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f48207g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f48208i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f48202a, 0.0f, 1.0f) * 0.5f;
    }
}
