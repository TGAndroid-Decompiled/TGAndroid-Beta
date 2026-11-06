package wg;
public final class i implements Runnable {
    public final int f57663a;
    public final l f57664b;

    public i(l lVar, int i7) {
        this.f57663a = i7;
        this.f57664b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57663a) {
            case 0:
                this.f57664b.dismiss();
                return;
            default:
                this.f57664b.onBackPressed();
                return;
        }
    }
}
