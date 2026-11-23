package zh;
public final class e implements Runnable {
    public final int f62116a;
    public final l f62117b;

    public e(l lVar, int i7) {
        this.f62116a = i7;
        this.f62117b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f62116a) {
            case 0:
                this.f62117b.e();
                return;
            case 1:
                l.k(this.f62117b.f62151q, true, true);
                return;
            default:
                this.f62117b.e();
                return;
        }
    }
}
