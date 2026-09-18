package tg;
public final class l implements Runnable {
    public final int f43187a;
    public final o f43188b;

    public l(o oVar, int i10) {
        this.f43187a = i10;
        this.f43188b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f43187a) {
            case 0:
                this.f43188b.dismiss();
                return;
            default:
                this.f43188b.onBackPressed();
                return;
        }
    }
}
