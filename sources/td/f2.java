package td;
public final class f2 extends yd.s implements Runnable {
    public final long e;

    public f2(long j10, cd.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f48608c);
        i(new e2("Timed out waiting for " + this.e + " ms", this));
    }
}
