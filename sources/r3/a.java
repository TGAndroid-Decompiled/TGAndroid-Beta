package r3;
public final class a implements s {
    public final c f43199a;
    public final long f43200b;
    public final long f43201c;
    public final long d;
    public final long e;
    public final long f43202f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f43199a = cVar;
        this.f43200b = j10;
        this.f43201c = j11;
        this.d = j12;
        this.e = j13;
        this.f43202f = j14;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        t tVar = new t(j10, b.a(this.f43199a.f(j10), 0L, this.f43201c, this.d, this.e, this.f43202f));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f43200b;
    }
}
