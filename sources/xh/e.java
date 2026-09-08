package xh;
public final class e implements Runnable {
    public final int f49440a;
    public final n f49441b;

    public e(n nVar, int i10) {
        this.f49440a = i10;
        this.f49441b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49440a) {
            case 0:
                this.f49441b.e();
                return;
            case 1:
                n.k(this.f49441b.f49485q, true, true);
                return;
            default:
                this.f49441b.e();
                return;
        }
    }
}
