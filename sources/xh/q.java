package xh;
public final class q implements Runnable {
    public final int f51503a;
    public final x f51504b;

    public q(x xVar, int i10) {
        this.f51503a = i10;
        this.f51504b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f51503a) {
            case 0:
                this.f51504b.onBackPressed();
                return;
            default:
                this.f51504b.U();
                return;
        }
    }
}
