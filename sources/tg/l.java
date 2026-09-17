package tg;
public final class l implements Runnable {
    public final int f43182a;
    public final o f43183b;

    public l(o oVar, int i10) {
        this.f43182a = i10;
        this.f43183b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f43182a) {
            case 0:
                this.f43183b.dismiss();
                return;
            default:
                this.f43183b.onBackPressed();
                return;
        }
    }
}
