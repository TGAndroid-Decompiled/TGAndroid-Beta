package yh;
public final class e implements Runnable {
    public final int f59397a;
    public final m f59398b;

    public e(m mVar, int i7) {
        this.f59397a = i7;
        this.f59398b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59397a) {
            case 0:
                this.f59398b.e();
                return;
            case 1:
                m.k(this.f59398b.f59434q, true, true);
                return;
            default:
                this.f59398b.e();
                return;
        }
    }
}
