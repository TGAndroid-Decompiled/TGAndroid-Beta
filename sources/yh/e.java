package yh;
public final class e implements Runnable {
    public final int f52589a;
    public final k f52590b;

    public e(k kVar, int i10) {
        this.f52589a = i10;
        this.f52590b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f52589a) {
            case 0:
                this.f52590b.e();
                return;
            case 1:
                k.k(this.f52590b.f52620q, true, true);
                return;
            default:
                this.f52590b.e();
                return;
        }
    }
}
