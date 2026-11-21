package wg;
public final class i implements Runnable {
    public final int f59808a;
    public final l f59809b;

    public i(l lVar, int i7) {
        this.f59808a = i7;
        this.f59809b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59808a) {
            case 0:
                this.f59809b.dismiss();
                return;
            default:
                this.f59809b.onBackPressed();
                return;
        }
    }
}
