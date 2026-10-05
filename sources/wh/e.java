package wh;
public final class e implements Runnable {
    public final int f49119a;
    public final n f49120b;

    public e(n nVar, int i10) {
        this.f49119a = i10;
        this.f49120b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49119a) {
            case 0:
                this.f49120b.e();
                return;
            case 1:
                n.k(this.f49120b.f49164q, true, true);
                return;
            default:
                this.f49120b.e();
                return;
        }
    }
}
