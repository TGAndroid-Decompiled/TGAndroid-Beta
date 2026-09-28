package wh;
public final class e implements Runnable {
    public final int f45363a;
    public final n f45364b;

    public e(n nVar, int i10) {
        this.f45363a = i10;
        this.f45364b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45363a) {
            case 0:
                this.f45364b.e();
                return;
            case 1:
                n.k(this.f45364b.f45403q, true, true);
                return;
            default:
                this.f45364b.e();
                return;
        }
    }
}
