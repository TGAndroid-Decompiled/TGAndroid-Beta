package xh;
public final class e implements Runnable {
    public final int f50289a;
    public final k f50290b;

    public e(k kVar, int i10) {
        this.f50289a = i10;
        this.f50290b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f50289a) {
            case 0:
                this.f50290b.e();
                return;
            case 1:
                k.k(this.f50290b.f50320q, true, true);
                return;
            default:
                this.f50290b.e();
                return;
        }
    }
}
