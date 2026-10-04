package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f53217e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f53217e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f53217e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f53190c);
        i(new d2("Timed out waiting for " + this.f53217e + " ms", this));
    }
}
