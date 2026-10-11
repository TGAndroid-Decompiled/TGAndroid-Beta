package wh;
public final class e implements Runnable {
    public final int f50491a;
    public final l f50492b;

    public e(l lVar, int i10) {
        this.f50491a = i10;
        this.f50492b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50491a) {
            case 0:
                this.f50492b.e();
                return;
            case 1:
                l.k(this.f50492b.f50530q, true, true);
                return;
            default:
                this.f50492b.e();
                return;
        }
    }
}
