package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f51576e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f51576e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f51576e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f51549c);
        i(new d2("Timed out waiting for " + this.f51576e + " ms", this));
    }
}
