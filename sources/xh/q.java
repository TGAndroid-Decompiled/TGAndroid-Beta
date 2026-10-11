package xh;
public final class q implements Runnable {
    public final int f51580a;
    public final x f51581b;

    public q(x xVar, int i10) {
        this.f51580a = i10;
        this.f51581b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51580a) {
            case 0:
                this.f51581b.onBackPressed();
                return;
            default:
                this.f51581b.U();
                return;
        }
    }
}
