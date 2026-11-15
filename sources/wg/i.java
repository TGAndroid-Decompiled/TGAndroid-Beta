package wg;
public final class i implements Runnable {
    public final int f59187a;
    public final l f59188b;

    public i(l lVar, int i7) {
        this.f59187a = i7;
        this.f59188b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59187a) {
            case 0:
                this.f59188b.dismiss();
                return;
            default:
                this.f59188b.onBackPressed();
                return;
        }
    }
}
