package zd;
public final class e2 extends ee.s implements Runnable {
    public final long f53223e;

    public e2(long j3, id.c cVar) {
        super(cVar, cVar.getContext());
        this.f53223e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f53223e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f53196c);
        i(new d2("Timed out waiting for " + this.f53223e + " ms", this));
    }
}
