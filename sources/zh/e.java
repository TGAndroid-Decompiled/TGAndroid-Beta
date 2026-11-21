package zh;
public final class e implements Runnable {
    public final int f62029a;
    public final l f62030b;

    public e(l lVar, int i7) {
        this.f62029a = i7;
        this.f62030b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f62029a) {
            case 0:
                this.f62030b.e();
                return;
            case 1:
                l.k(this.f62030b.f62064q, true, true);
                return;
            default:
                this.f62030b.e();
                return;
        }
    }
}
