package wg;
public final class i implements Runnable {
    public final int f59880a;
    public final l f59881b;

    public i(l lVar, int i7) {
        this.f59880a = i7;
        this.f59881b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59880a) {
            case 0:
                this.f59881b.dismiss();
                return;
            default:
                this.f59881b.onBackPressed();
                return;
        }
    }
}
