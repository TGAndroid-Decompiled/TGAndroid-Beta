package wh;
public final class e implements Runnable {
    public final int f49103a;
    public final n f49104b;

    public e(n nVar, int i10) {
        this.f49103a = i10;
        this.f49104b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49103a) {
            case 0:
                this.f49104b.e();
                return;
            case 1:
                n.k(this.f49104b.f49148q, true, true);
                return;
            default:
                this.f49104b.e();
                return;
        }
    }
}
