package zd;
public final class e2 extends ee.s implements Runnable {
    public final long e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f47984c);
        i(new d2("Timed out waiting for " + this.e + " ms", this));
    }
}
