package wh;
public final class e implements Runnable {
    public final int f45408a;
    public final n f45409b;

    public e(n nVar, int i10) {
        this.f45408a = i10;
        this.f45409b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45408a) {
            case 0:
                this.f45409b.e();
                return;
            case 1:
                n.k(this.f45409b.f45448q, true, true);
                return;
            default:
                this.f45409b.e();
                return;
        }
    }
}
