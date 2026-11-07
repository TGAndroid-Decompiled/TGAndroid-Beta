package yh;
public final class e implements Runnable {
    public final int f59427a;
    public final m f59428b;

    public e(m mVar, int i7) {
        this.f59427a = i7;
        this.f59428b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59427a) {
            case 0:
                this.f59428b.e();
                return;
            case 1:
                m.k(this.f59428b.f59464q, true, true);
                return;
            default:
                this.f59428b.e();
                return;
        }
    }
}
