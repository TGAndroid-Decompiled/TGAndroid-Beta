package xh;
public final class q implements Runnable {
    public final int f51457a;
    public final x f51458b;

    public q(x xVar, int i10) {
        this.f51457a = i10;
        this.f51458b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51457a) {
            case 0:
                this.f51458b.onBackPressed();
                return;
            default:
                this.f51458b.U();
                return;
        }
    }
}
