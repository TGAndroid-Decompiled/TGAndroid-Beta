package wg;
public final class i implements Runnable {
    public final int f59812a;
    public final l f59813b;

    public i(l lVar, int i7) {
        this.f59812a = i7;
        this.f59813b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59812a) {
            case 0:
                this.f59813b.dismiss();
                return;
            default:
                this.f59813b.onBackPressed();
                return;
        }
    }
}
