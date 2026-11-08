package yh;
public final class e implements Runnable {
    public final int f59520a;
    public final m f59521b;

    public e(m mVar, int i7) {
        this.f59520a = i7;
        this.f59521b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59520a) {
            case 0:
                this.f59521b.e();
                return;
            case 1:
                m.k(this.f59521b.f59557q, true, true);
                return;
            default:
                this.f59521b.e();
                return;
        }
    }
}
