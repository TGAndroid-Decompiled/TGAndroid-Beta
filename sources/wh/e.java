package wh;
public final class e implements Runnable {
    public final int f50403a;
    public final l f50404b;

    public e(l lVar, int i10) {
        this.f50403a = i10;
        this.f50404b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50403a) {
            case 0:
                this.f50404b.e();
                return;
            case 1:
                l.k(this.f50404b.f50442q, true, true);
                return;
            default:
                this.f50404b.e();
                return;
        }
    }
}
