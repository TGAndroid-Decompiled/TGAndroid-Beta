package u0;
public final class a {
    public int f58233a;
    public int f58234b;
    public float f58235c;
    public float d;
    public long f58236e;
    public long f58237f;
    public long f58238g;
    public float h;
    public int f58239i;

    public final float a(long j3) {
        long j10 = this.f58236e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58238g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58239i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58233a, 0.0f, 1.0f) * 0.5f;
    }
}
