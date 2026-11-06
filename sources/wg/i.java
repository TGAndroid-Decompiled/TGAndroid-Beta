package wg;
public final class i implements Runnable {
    public final int f57638a;
    public final l f57639b;

    public i(l lVar, int i7) {
        this.f57638a = i7;
        this.f57639b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57638a) {
            case 0:
                this.f57639b.dismiss();
                return;
            default:
                this.f57639b.onBackPressed();
                return;
        }
    }
}
