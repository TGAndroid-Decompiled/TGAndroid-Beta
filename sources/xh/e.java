package xh;
public final class e implements Runnable {
    public final int f49849a;
    public final k f49850b;

    public e(k kVar, int i10) {
        this.f49849a = i10;
        this.f49850b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49849a) {
            case 0:
                this.f49850b.e();
                return;
            case 1:
                k.k(this.f49850b.f49880q, true, true);
                return;
            default:
                this.f49850b.e();
                return;
        }
    }
}
