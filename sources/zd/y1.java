package zd;
public final class y1 extends ee.q implements Runnable {
    public final long f61907e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f61907e = j3;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f61907e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f61811c);
        j(new x1("Timed out waiting for " + this.f61907e + " ms", this));
    }
}
