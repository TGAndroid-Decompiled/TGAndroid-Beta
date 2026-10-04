package wh;
public final class e implements Runnable {
    public final int f49112a;
    public final n f49113b;

    public e(n nVar, int i10) {
        this.f49112a = i10;
        this.f49113b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49112a) {
            case 0:
                this.f49113b.e();
                return;
            case 1:
                n.k(this.f49113b.f49157q, true, true);
                return;
            default:
                this.f49113b.e();
                return;
        }
    }
}
