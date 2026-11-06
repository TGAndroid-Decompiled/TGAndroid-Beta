package zd;
public final class y1 extends ee.q implements Runnable {
    public final long f60010e;

    public y1(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f60010e = j3;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f60010e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f59914c);
        j(new x1("Timed out waiting for " + this.f60010e + " ms", this));
    }
}
