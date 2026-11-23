package wg;
public final class i implements Runnable {
    public final int f59777a;
    public final l f59778b;

    public i(l lVar, int i7) {
        this.f59777a = i7;
        this.f59778b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59777a) {
            case 0:
                this.f59778b.dismiss();
                return;
            default:
                this.f59778b.onBackPressed();
                return;
        }
    }
}
