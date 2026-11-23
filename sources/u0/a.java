package u0;
public final class a {
    public int f58359a;
    public int f58360b;
    public float f58361c;
    public float d;
    public long f58362e;
    public long f58363f;
    public long f58364g;
    public float h;
    public int f58365i;

    public final float a(long j3) {
        long j10 = this.f58362e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58364g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58365i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58359a, 0.0f, 1.0f) * 0.5f;
    }
}
