package xh;
public final class e implements Runnable {
    public final int f48453a;
    public final l f48454b;

    public e(l lVar, int i10) {
        this.f48453a = i10;
        this.f48454b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f48453a) {
            case 0:
                this.f48454b.e();
                return;
            case 1:
                l.k(this.f48454b.f48488q, true, true);
                return;
            default:
                this.f48454b.e();
                return;
        }
    }
}
