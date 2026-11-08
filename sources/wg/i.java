package wg;
public final class i implements Runnable {
    public final int f57755a;
    public final l f57756b;

    public i(l lVar, int i7) {
        this.f57755a = i7;
        this.f57756b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57755a) {
            case 0:
                this.f57756b.dismiss();
                return;
            default:
                this.f57756b.onBackPressed();
                return;
        }
    }
}
