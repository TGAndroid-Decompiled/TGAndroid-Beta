package u0;
public final class a {
    public int f46578a;
    public int f46579b;
    public float f46580c;
    public float d;
    public long f46581e;
    public long f46582f;
    public long f46583g;
    public float h;
    public int f46584i;

    public final float a(long j3) {
        long j10 = this.f46581e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f46583g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f46584i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f46578a, 0.0f, 1.0f) * 0.5f;
    }
}
