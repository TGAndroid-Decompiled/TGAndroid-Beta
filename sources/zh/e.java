package zh;
public final class e implements Runnable {
    public final int f61998a;
    public final l f61999b;

    public e(l lVar, int i7) {
        this.f61998a = i7;
        this.f61999b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f61998a) {
            case 0:
                this.f61999b.e();
                return;
            case 1:
                l.k(this.f61999b.f62033q, true, true);
                return;
            default:
                this.f61999b.e();
                return;
        }
    }
}
