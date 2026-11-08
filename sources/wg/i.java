package wg;
public final class i implements Runnable {
    public final int f57754a;
    public final l f57755b;

    public i(l lVar, int i7) {
        this.f57754a = i7;
        this.f57755b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57754a) {
            case 0:
                this.f57755b.dismiss();
                return;
            default:
                this.f57755b.onBackPressed();
                return;
        }
    }
}
