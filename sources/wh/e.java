package wh;
public final class e implements Runnable {
    public final int f49104a;
    public final n f49105b;

    public e(n nVar, int i10) {
        this.f49104a = i10;
        this.f49105b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f49104a) {
            case 0:
                this.f49105b.e();
                return;
            case 1:
                n.k(this.f49105b.f49149q, true, true);
                return;
            default:
                this.f49105b.e();
                return;
        }
    }
}
