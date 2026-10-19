package xh;
public final class e implements Runnable {
    public final int f49840a;
    public final k f49841b;

    public e(k kVar, int i10) {
        this.f49840a = i10;
        this.f49841b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49840a) {
            case 0:
                this.f49841b.e();
                return;
            case 1:
                k.k(this.f49841b.f49871q, true, true);
                return;
            default:
                this.f49841b.e();
                return;
        }
    }
}
