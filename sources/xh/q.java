package xh;
public final class q implements Runnable {
    public final int f51546a;
    public final x f51547b;

    public q(x xVar, int i10) {
        this.f51546a = i10;
        this.f51547b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51546a) {
            case 0:
                this.f51547b.onBackPressed();
                return;
            default:
                this.f51547b.U();
                return;
        }
    }
}
