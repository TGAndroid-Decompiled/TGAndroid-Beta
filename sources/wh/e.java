package wh;
public final class e implements Runnable {
    public final int f50640a;
    public final l f50641b;

    public e(l lVar, int i10) {
        this.f50640a = i10;
        this.f50641b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50640a) {
            case 0:
                this.f50641b.e();
                return;
            case 1:
                l.k(this.f50641b.f50679q, true, true);
                return;
            default:
                this.f50641b.e();
                return;
        }
    }
}
