package tg;
public final class l implements Runnable {
    public final int f43156a;
    public final o f43157b;

    public l(o oVar, int i10) {
        this.f43156a = i10;
        this.f43157b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f43156a) {
            case 0:
                this.f43157b.dismiss();
                return;
            default:
                this.f43157b.onBackPressed();
                return;
        }
    }
}
