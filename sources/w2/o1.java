package w2;
public final class o1 implements d1 {
    public final d1 f57180a;
    public final long f57181b;

    public o1(d1 d1Var, long j10) {
        this.f57180a = d1Var;
        this.f57181b = j10;
    }

    @Override
    public final void a() {
        this.f57180a.a();
    }

    @Override
    public final boolean f() {
        return this.f57180a.f();
    }

    @Override
    public final int m(long j10) {
        return this.f57180a.m(j10 - this.f57181b);
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        int o10 = this.f57180a.o(bVar, hVar, i3);
        if (o10 == -4) {
            hVar.f16158e += this.f57181b;
        }
        return o10;
    }
}
