package u0;
public final class a {
    public int f48526a;
    public int f48527b;
    public float f48528c;
    public float d;
    public long f48529e;
    public long f48530f;
    public long f48531g;
    public float h;
    public int f48532i;

    public final float a(long j3) {
        long j10 = this.f48529e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48531g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48532i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48526a, 0.0f, 1.0f) * 0.5f;
    }
}
