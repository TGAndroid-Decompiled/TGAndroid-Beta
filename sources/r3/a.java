package r3;
public final class a implements s {
    public final c f46529a;
    public final long f46530b;
    public final long f46531c;
    public final long d;
    public final long f46532e;
    public final long f46533f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f46529a = cVar;
        this.f46530b = j10;
        this.f46531c = j11;
        this.d = j12;
        this.f46532e = j13;
        this.f46533f = j14;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        t tVar = new t(j10, b.a(this.f46529a.f(j10), 0L, this.f46531c, this.d, this.f46532e, this.f46533f));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f46530b;
    }
}
