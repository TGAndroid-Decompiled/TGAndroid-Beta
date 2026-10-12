package xh;
public final class q implements Runnable {
    public final int f51683a;
    public final x f51684b;

    public q(x xVar, int i10) {
        this.f51683a = i10;
        this.f51684b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51683a) {
            case 0:
                this.f51684b.onBackPressed();
                return;
            default:
                this.f51684b.U();
                return;
        }
    }
}
