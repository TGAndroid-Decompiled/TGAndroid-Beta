package wh;
public final class e implements Runnable {
    public final int f45364a;
    public final n f45365b;

    public e(n nVar, int i10) {
        this.f45364a = i10;
        this.f45365b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45364a) {
            case 0:
                this.f45365b.e();
                return;
            case 1:
                n.k(this.f45365b.f45404q, true, true);
                return;
            default:
                this.f45365b.e();
                return;
        }
    }
}
