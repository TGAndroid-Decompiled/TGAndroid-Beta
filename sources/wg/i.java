package wg;
public final class i implements Runnable {
    public final int f57753a;
    public final l f57754b;

    public i(l lVar, int i7) {
        this.f57753a = i7;
        this.f57754b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57753a) {
            case 0:
                this.f57754b.dismiss();
                return;
            default:
                this.f57754b.onBackPressed();
                return;
        }
    }
}
