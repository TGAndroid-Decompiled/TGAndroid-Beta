package wh;
public final class e implements Runnable {
    public final int f50632a;
    public final l f50633b;

    public e(l lVar, int i10) {
        this.f50632a = i10;
        this.f50633b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50632a) {
            case 0:
                this.f50633b.e();
                return;
            case 1:
                l.k(this.f50633b.f50671q, true, true);
                return;
            default:
                this.f50633b.e();
                return;
        }
    }
}
