package yh;
public final class e implements Runnable {
    public final int f52650a;
    public final k f52651b;

    public e(k kVar, int i10) {
        this.f52650a = i10;
        this.f52651b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f52650a) {
            case 0:
                this.f52651b.e();
                return;
            case 1:
                k.k(this.f52651b.f52681q, true, true);
                return;
            default:
                this.f52651b.e();
                return;
        }
    }
}
