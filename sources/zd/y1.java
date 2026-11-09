package zd;
public final class y1 extends ee.q implements Runnable {
    public final long f60143e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f60143e = j3;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f60143e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f60047c);
        j(new x1("Timed out waiting for " + this.f60143e + " ms", this));
    }
}
