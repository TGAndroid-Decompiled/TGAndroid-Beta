package xh;
public final class e implements Runnable {
    public final int f49861a;
    public final k f49862b;

    public e(k kVar, int i10) {
        this.f49861a = i10;
        this.f49862b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49861a) {
            case 0:
                this.f49862b.e();
                return;
            case 1:
                k.k(this.f49862b.f49892q, true, true);
                return;
            default:
                this.f49862b.e();
                return;
        }
    }
}
