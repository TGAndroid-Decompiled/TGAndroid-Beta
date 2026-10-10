package wh;
public final class e implements Runnable {
    public final int f50447a;
    public final l f50448b;

    public e(l lVar, int i10) {
        this.f50447a = i10;
        this.f50448b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50447a) {
            case 0:
                this.f50448b.e();
                return;
            case 1:
                l.k(this.f50448b.f50486q, true, true);
                return;
            default:
                this.f50448b.e();
                return;
        }
    }
}
