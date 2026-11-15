package zh;
public final class e implements Runnable {
    public final int f61421a;
    public final l f61422b;

    public e(l lVar, int i7) {
        this.f61421a = i7;
        this.f61422b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f61421a) {
            case 0:
                this.f61422b.e();
                return;
            case 1:
                l.k(this.f61422b.f61456q, true, true);
                return;
            default:
                this.f61422b.e();
                return;
        }
    }
}
