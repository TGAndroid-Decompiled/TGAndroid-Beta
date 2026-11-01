package u2;
public final class o1 implements d1 {
    public final d1 f49984a;
    public final long f49985b;

    public o1(d1 d1Var, long j10) {
        this.f49984a = d1Var;
        this.f49985b = j10;
    }

    @Override
    public final void a() {
        this.f49984a.a();
    }

    @Override
    public final boolean e() {
        return this.f49984a.e();
    }

    @Override
    public final int i(long j10) {
        return this.f49984a.i(j10 - this.f49985b);
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        int r10 = this.f49984a.r(bVar, hVar, i10);
        if (r10 == -4) {
            hVar.e += this.f49985b;
        }
        return r10;
    }
}
