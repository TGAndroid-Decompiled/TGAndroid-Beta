package u0;

public final class a {

    public int f48229a;

    public int f48230b;

    public float f48231c;
    public float d;

    public long f48232e;

    public long f48233f;

    public long f48234g;
    public float h;

    public int f48235i;

    public final float a(long j10) {
        long j11 = this.f48232e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f48234g;
        if (j12 < 0 || j10 < j12) {
            return d.b((j10 - j11) / this.f48229a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.h;
        return (d.b((j10 - j12) / this.f48235i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
