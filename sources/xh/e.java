package xh;
public final class e implements Runnable {
    public final int f49886a;
    public final k f49887b;

    public e(k kVar, int i10) {
        this.f49886a = i10;
        this.f49887b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49886a) {
            case 0:
                this.f49887b.e();
                return;
            case 1:
                k.k(this.f49887b.f49917q, true, true);
                return;
            default:
                this.f49887b.e();
                return;
        }
    }
}
