package xh;
public final class e implements Runnable {
    public final int f49441a;
    public final n f49442b;

    public e(n nVar, int i10) {
        this.f49441a = i10;
        this.f49442b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49441a) {
            case 0:
                this.f49442b.e();
                return;
            case 1:
                n.k(this.f49442b.f49486q, true, true);
                return;
            default:
                this.f49442b.e();
                return;
        }
    }
}
