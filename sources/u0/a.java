package u0;
public final class a {
    public int f49250a;
    public int f49251b;
    public float f49252c;
    public float d;
    public long e;
    public long f49253f;
    public long f49254g;
    public float h;
    public int f49255i;

    public final float a(long j10) {
        long j11 = this.e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f49254g;
        if (j12 >= 0 && j10 >= j12) {
            float f7 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f49255i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j10 - j11)) / this.f49250a, 0.0f, 1.0f) * 0.5f;
    }
}
