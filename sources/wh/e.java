package wh;
public final class e implements Runnable {
    public final int f50401a;
    public final l f50402b;

    public e(l lVar, int i10) {
        this.f50401a = i10;
        this.f50402b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f50401a) {
            case 0:
                this.f50402b.e();
                return;
            case 1:
                l.k(this.f50402b.f50440q, true, true);
                return;
            default:
                this.f50402b.e();
                return;
        }
    }
}
