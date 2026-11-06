package yh;
public final class e implements Runnable {
    public final int f59421a;
    public final m f59422b;

    public e(m mVar, int i7) {
        this.f59421a = i7;
        this.f59422b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59421a) {
            case 0:
                this.f59422b.e();
                return;
            case 1:
                m.k(this.f59422b.f59458q, true, true);
                return;
            default:
                this.f59422b.e();
                return;
        }
    }
}
