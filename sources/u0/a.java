package u0;
public final class a {
    public int f58234a;
    public int f58235b;
    public float f58236c;
    public float d;
    public long f58237e;
    public long f58238f;
    public long f58239g;
    public float h;
    public int f58240i;

    public final float a(long j3) {
        long j10 = this.f58237e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58239g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58240i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58234a, 0.0f, 1.0f) * 0.5f;
    }
}
