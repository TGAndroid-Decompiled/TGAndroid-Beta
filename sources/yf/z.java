package yf;

public final class z implements Runnable {

    public final int f50128a;

    public final d0 f50129b;

    public z(d0 d0Var, int i10) {
        this.f50128a = i10;
        this.f50129b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f50128a) {
            case 0:
                d0 d0Var = this.f50129b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f49896a.g(mVar);
                    d0Var.A = null;
                }
                break;
            default:
                this.f50129b.a(null, true, null);
                break;
        }
    }
}
