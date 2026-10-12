package xh;
public final class q implements Runnable {
    public final int f51691a;
    public final x f51692b;

    public q(x xVar, int i10) {
        this.f51691a = i10;
        this.f51692b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51691a) {
            case 0:
                this.f51692b.onBackPressed();
                return;
            default:
                this.f51692b.U();
                return;
        }
    }
}
