package zd;
public final class y1 extends ee.q implements Runnable {
    public final long f61342e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f61342e = j3;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f61342e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f61246c);
        j(new x1("Timed out waiting for " + this.f61342e + " ms", this));
    }
}
