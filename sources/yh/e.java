package yh;
public final class e implements Runnable {
    public final int f52592a;
    public final k f52593b;

    public e(k kVar, int i10) {
        this.f52592a = i10;
        this.f52593b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f52592a) {
            case 0:
                this.f52593b.e();
                return;
            case 1:
                k.k(this.f52593b.f52623q, true, true);
                return;
            default:
                this.f52593b.e();
                return;
        }
    }
}
