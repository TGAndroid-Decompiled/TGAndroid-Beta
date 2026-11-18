package zh;
public final class e implements Runnable {
    public final int f61988a;
    public final l f61989b;

    public e(l lVar, int i7) {
        this.f61988a = i7;
        this.f61989b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f61988a) {
            case 0:
                this.f61989b.e();
                return;
            case 1:
                l.k(this.f61989b.f62023q, true, true);
                return;
            default:
                this.f61989b.e();
                return;
        }
    }
}
