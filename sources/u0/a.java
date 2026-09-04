package u0;
public final class a {
    public int f46577a;
    public int f46578b;
    public float f46579c;
    public float d;
    public long f46580e;
    public long f46581f;
    public long f46582g;
    public float h;
    public int f46583i;

    public final float a(long j3) {
        long j10 = this.f46580e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f46582g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f46583i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f46577a, 0.0f, 1.0f) * 0.5f;
    }
}
