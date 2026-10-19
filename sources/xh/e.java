package xh;
public final class e implements Runnable {
    public final int f49838a;
    public final k f49839b;

    public e(k kVar, int i10) {
        this.f49838a = i10;
        this.f49839b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49838a) {
            case 0:
                this.f49839b.e();
                return;
            case 1:
                k.k(this.f49839b.f49869q, true, true);
                return;
            default:
                this.f49839b.e();
                return;
        }
    }
}
