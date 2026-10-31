package u2;
public final class o1 implements d1 {
    public final d1 f49970a;
    public final long f49971b;

    public o1(d1 d1Var, long j10) {
        this.f49970a = d1Var;
        this.f49971b = j10;
    }

    @Override
    public final void a() {
        this.f49970a.a();
    }

    @Override
    public final boolean e() {
        return this.f49970a.e();
    }

    @Override
    public final int i(long j10) {
        return this.f49970a.i(j10 - this.f49971b);
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        int r10 = this.f49970a.r(bVar, hVar, i10);
        if (r10 == -4) {
            hVar.e += this.f49971b;
        }
        return r10;
    }
}
