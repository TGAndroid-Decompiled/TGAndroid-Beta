package xh;
public final class e implements Runnable {
    public final int f49839a;
    public final k f49840b;

    public e(k kVar, int i10) {
        this.f49839a = i10;
        this.f49840b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49839a) {
            case 0:
                this.f49840b.e();
                return;
            case 1:
                k.k(this.f49840b.f49870q, true, true);
                return;
            default:
                this.f49840b.e();
                return;
        }
    }
}
