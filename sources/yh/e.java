package yh;
public final class e implements Runnable {
    public final int f59527a;
    public final m f59528b;

    public e(m mVar, int i7) {
        this.f59527a = i7;
        this.f59528b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59527a) {
            case 0:
                this.f59528b.e();
                return;
            case 1:
                m.k(this.f59528b.f59564q, true, true);
                return;
            default:
                this.f59528b.e();
                return;
        }
    }
}
