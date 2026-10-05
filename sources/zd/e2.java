package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f53244e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f53244e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f53244e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f53217c);
        i(new d2("Timed out waiting for " + this.f53244e + " ms", this));
    }
}
