package r3;
public final class a implements s {
    public final c f46560a;
    public final long f46561b;
    public final long f46562c;
    public final long d;
    public final long f46563e;
    public final long f46564f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.f46560a = cVar;
        this.f46561b = j10;
        this.f46562c = j11;
        this.d = j12;
        this.f46563e = j13;
        this.f46564f = j14;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        t tVar = new t(j10, b.a(this.f46560a.f(j10), 0L, this.f46562c, this.d, this.f46563e, this.f46564f));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f46561b;
    }
}
