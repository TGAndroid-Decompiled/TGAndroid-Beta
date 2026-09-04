package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f51545e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f51545e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f51545e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f51518c);
        i(new d2("Timed out waiting for " + this.f51545e + " ms", this));
    }
}
