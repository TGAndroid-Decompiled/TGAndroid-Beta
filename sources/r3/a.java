package r3;
public final class a implements s {
    public final c f43223a;
    public final long f43224b;
    public final long f43225c;
    public final long d;
    public final long e;
    public final long f43226f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f43223a = cVar;
        this.f43224b = j10;
        this.f43225c = j11;
        this.d = j12;
        this.e = j13;
        this.f43226f = j14;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        t tVar = new t(j10, b.a(this.f43223a.k(j10), 0L, this.f43225c, this.d, this.e, this.f43226f));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f43224b;
    }
}
