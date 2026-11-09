package yh;
public final class e implements Runnable {
    public final int f59529a;
    public final m f59530b;

    public e(m mVar, int i7) {
        this.f59529a = i7;
        this.f59530b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59529a) {
            case 0:
                this.f59530b.e();
                return;
            case 1:
                m.k(this.f59530b.f59566q, true, true);
                return;
            default:
                this.f59530b.e();
                return;
        }
    }
}
