package wh;
public final class e implements Runnable {
    public final int f45361a;
    public final n f45362b;

    public e(n nVar, int i10) {
        this.f45361a = i10;
        this.f45362b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45361a) {
            case 0:
                this.f45362b.e();
                return;
            case 1:
                n.k(this.f45362b.f45401q, true, true);
                return;
            default:
                this.f45362b.e();
                return;
        }
    }
}
