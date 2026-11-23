package zd;
public final class y1 extends ee.q implements Runnable {
    public final long f62036e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f62036e = j3;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f62036e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f61940c);
        j(new x1("Timed out waiting for " + this.f62036e + " ms", this));
    }
}
