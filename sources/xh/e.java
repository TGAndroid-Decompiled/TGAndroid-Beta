package xh;
public final class e implements Runnable {
    public final int f49411a;
    public final n f49412b;

    public e(n nVar, int i10) {
        this.f49411a = i10;
        this.f49412b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49411a) {
            case 0:
                this.f49412b.e();
                return;
            case 1:
                n.k(this.f49412b.f49456q, true, true);
                return;
            default:
                this.f49412b.e();
                return;
        }
    }
}
