package xh;
public final class e implements Runnable {
    public final int f50288a;
    public final k f50289b;

    public e(k kVar, int i10) {
        this.f50288a = i10;
        this.f50289b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f50288a) {
            case 0:
                this.f50289b.e();
                return;
            case 1:
                k.k(this.f50289b.f50319q, true, true);
                return;
            default:
                this.f50289b.e();
                return;
        }
    }
}
