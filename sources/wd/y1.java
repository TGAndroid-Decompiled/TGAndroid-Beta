package wd;
public final class y1 extends be.q implements Runnable {
    public final long f57553e;

    public y1(long j10, fd.c cVar) {
        super(cVar, cVar.getContext());
        this.f57553e = j10;
    }

    @Override
    public final String E() {
        return super.E() + "(timeMillis=" + this.f57553e + ')';
    }

    @Override
    public final void run() {
        b0.i(this.f57457c);
        j(new x1("Timed out waiting for " + this.f57553e + " ms", this));
    }
}
