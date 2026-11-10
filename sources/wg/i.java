package wg;
public final class i implements Runnable {
    public final int f57752a;
    public final l f57753b;

    public i(l lVar, int i7) {
        this.f57752a = i7;
        this.f57753b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57752a) {
            case 0:
                this.f57753b.dismiss();
                return;
            default:
                this.f57753b.onBackPressed();
                return;
        }
    }
}
