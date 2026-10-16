package xh;
public final class e implements Runnable {
    public final int f48452a;
    public final l f48453b;

    public e(l lVar, int i10) {
        this.f48452a = i10;
        this.f48453b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f48452a) {
            case 0:
                this.f48453b.e();
                return;
            case 1:
                l.k(this.f48453b.f48487q, true, true);
                return;
            default:
                this.f48453b.e();
                return;
        }
    }
}
