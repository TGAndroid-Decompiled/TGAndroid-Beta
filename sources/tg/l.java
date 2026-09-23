package tg;
public final class l implements Runnable {
    public final int f43111a;
    public final o f43112b;

    public l(o oVar, int i10) {
        this.f43111a = i10;
        this.f43112b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f43111a) {
            case 0:
                this.f43112b.dismiss();
                return;
            default:
                this.f43112b.onBackPressed();
                return;
        }
    }
}
