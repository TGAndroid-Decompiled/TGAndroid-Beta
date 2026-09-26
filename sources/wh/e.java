package wh;
public final class e implements Runnable {
    public final int f45362a;
    public final n f45363b;

    public e(n nVar, int i10) {
        this.f45362a = i10;
        this.f45363b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45362a) {
            case 0:
                this.f45363b.e();
                return;
            case 1:
                n.k(this.f45363b.f45402q, true, true);
                return;
            default:
                this.f45363b.e();
                return;
        }
    }
}
