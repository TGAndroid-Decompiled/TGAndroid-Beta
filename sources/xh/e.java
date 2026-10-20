package xh;
public final class e implements Runnable {
    public final int f49845a;
    public final k f49846b;

    public e(k kVar, int i10) {
        this.f49845a = i10;
        this.f49846b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49845a) {
            case 0:
                this.f49846b.e();
                return;
            case 1:
                k.k(this.f49846b.f49876q, true, true);
                return;
            default:
                this.f49846b.e();
                return;
        }
    }
}
