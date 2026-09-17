package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f51546e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f51546e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f51546e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f51519c);
        i(new d2("Timed out waiting for " + this.f51546e + " ms", this));
    }
}
