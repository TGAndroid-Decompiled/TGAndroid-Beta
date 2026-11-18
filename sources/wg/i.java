package wg;
public final class i implements Runnable {
    public final int f59766a;
    public final l f59767b;

    public i(l lVar, int i7) {
        this.f59766a = i7;
        this.f59767b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59766a) {
            case 0:
                this.f59767b.dismiss();
                return;
            default:
                this.f59767b.onBackPressed();
                return;
        }
    }
}
