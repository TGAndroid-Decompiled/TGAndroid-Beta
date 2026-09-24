package wh;
public final class e implements Runnable {
    public final int f45348a;
    public final n f45349b;

    public e(n nVar, int i10) {
        this.f45348a = i10;
        this.f45349b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45348a) {
            case 0:
                this.f45349b.e();
                return;
            case 1:
                n.k(this.f45349b.f45388q, true, true);
                return;
            default:
                this.f45349b.e();
                return;
        }
    }
}
