package xh;
public final class e implements Runnable {
    public final int f49412a;
    public final n f49413b;

    public e(n nVar, int i10) {
        this.f49412a = i10;
        this.f49413b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49412a) {
            case 0:
                this.f49413b.e();
                return;
            case 1:
                n.k(this.f49413b.f49457q, true, true);
                return;
            default:
                this.f49413b.e();
                return;
        }
    }
}
