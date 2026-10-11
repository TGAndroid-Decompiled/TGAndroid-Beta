package wh;
public final class e implements Runnable {
    public final int f50525a;
    public final l f50526b;

    public e(l lVar, int i10) {
        this.f50525a = i10;
        this.f50526b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50525a) {
            case 0:
                this.f50526b.e();
                return;
            case 1:
                l.k(this.f50526b.f50564q, true, true);
                return;
            default:
                this.f50526b.e();
                return;
        }
    }
}
