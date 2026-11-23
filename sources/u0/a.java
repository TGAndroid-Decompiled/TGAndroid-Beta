package u0;
public final class a {
    public int f58279a;
    public int f58280b;
    public float f58281c;
    public float d;
    public long f58282e;
    public long f58283f;
    public long f58284g;
    public float h;
    public int f58285i;

    public final float a(long j3) {
        long j10 = this.f58282e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f58284g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f58285i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return d.b(((float) (j3 - j10)) / this.f58279a, 0.0f, 1.0f) * 0.5f;
    }
}
