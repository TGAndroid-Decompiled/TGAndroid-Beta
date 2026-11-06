package yh;
public final class e implements Runnable {
    public final int f59422a;
    public final m f59423b;

    public e(m mVar, int i7) {
        this.f59422a = i7;
        this.f59423b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59422a) {
            case 0:
                this.f59423b.e();
                return;
            case 1:
                m.k(this.f59423b.f59459q, true, true);
                return;
            default:
                this.f59423b.e();
                return;
        }
    }
}
