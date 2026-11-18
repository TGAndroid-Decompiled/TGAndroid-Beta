package wg;
public final class i implements Runnable {
    public final int f59767a;
    public final l f59768b;

    public i(l lVar, int i7) {
        this.f59767a = i7;
        this.f59768b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59767a) {
            case 0:
                this.f59768b.dismiss();
                return;
            default:
                this.f59768b.onBackPressed();
                return;
        }
    }
}
