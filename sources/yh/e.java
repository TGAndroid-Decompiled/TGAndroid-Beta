package yh;
public final class e implements Runnable {
    public final int f59519a;
    public final m f59520b;

    public e(m mVar, int i7) {
        this.f59519a = i7;
        this.f59520b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59519a) {
            case 0:
                this.f59520b.e();
                return;
            case 1:
                m.k(this.f59520b.f59556q, true, true);
                return;
            default:
                this.f59520b.e();
                return;
        }
    }
}
