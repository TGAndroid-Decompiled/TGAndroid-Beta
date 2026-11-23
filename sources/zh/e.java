package zh;
public final class e implements Runnable {
    public final int f62033a;
    public final l f62034b;

    public e(l lVar, int i7) {
        this.f62033a = i7;
        this.f62034b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f62033a) {
            case 0:
                this.f62034b.e();
                return;
            case 1:
                l.k(this.f62034b.f62068q, true, true);
                return;
            default:
                this.f62034b.e();
                return;
        }
    }
}
