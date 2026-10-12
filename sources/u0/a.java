package u0;
public final class a {
    public int f48721a;
    public int f48722b;
    public float f48723c;
    public float d;
    public long f48724e;
    public long f48725f;
    public long f48726g;
    public float h;
    public int f48727i;

    public final float a(long j3) {
        long j10 = this.f48724e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f48726g;
        if (j11 >= 0 && j3 >= j11) {
            float f7 = this.h;
            return (d.b(((float) (j3 - j11)) / this.f48727i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
        return d.b(((float) (j3 - j10)) / this.f48721a, 0.0f, 1.0f) * 0.5f;
    }
}
