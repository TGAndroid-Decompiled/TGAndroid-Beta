package zh;
public final class e implements Runnable {
    public final int f61987a;
    public final l f61988b;

    public e(l lVar, int i7) {
        this.f61987a = i7;
        this.f61988b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f61987a) {
            case 0:
                this.f61988b.e();
                return;
            case 1:
                l.k(this.f61988b.f62022q, true, true);
                return;
            default:
                this.f61988b.e();
                return;
        }
    }
}
