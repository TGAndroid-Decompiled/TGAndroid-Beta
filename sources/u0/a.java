package u0;
public final class a {
    public int f55447a;
    public int f55448b;
    public float f55449c;
    public float d;
    public long f55450e;
    public long f55451f;
    public long f55452g;
    public float h;
    public int f55453i;

    public final float a(long j10) {
        long j11 = this.f55450e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f55452g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.h;
            return (d.b(((float) (j10 - j12)) / this.f55453i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j10 - j11)) / this.f55447a, 0.0f, 1.0f) * 0.5f;
    }
}
