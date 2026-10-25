package u0;
public final class a {
    public int f49212a;
    public int f49213b;
    public float f49214c;
    public float d;
    public long e;
    public long f49215f;
    public long f49216g;
    public float h;
    public int f49217i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f49216g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f49217i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f49212a, 0.0f, 1.0f) * 0.5f;
    }
}
