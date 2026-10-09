package xh;
public final class q implements Runnable {
    public final int f51459a;
    public final x f51460b;

    public q(x xVar, int i10) {
        this.f51459a = i10;
        this.f51460b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51459a) {
            case 0:
                this.f51460b.onBackPressed();
                return;
            default:
                this.f51460b.U();
                return;
        }
    }
}
