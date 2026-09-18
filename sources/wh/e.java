package wh;
public final class e implements Runnable {
    public final int f45112a;
    public final n f45113b;

    public e(n nVar, int i10) {
        this.f45112a = i10;
        this.f45113b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45112a) {
            case 0:
                this.f45113b.e();
                return;
            case 1:
                n.k(this.f45113b.f45152q, true, true);
                return;
            default:
                this.f45113b.e();
                return;
        }
    }
}
