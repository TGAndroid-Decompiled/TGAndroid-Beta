package tg;
public final class l implements Runnable {
    public final int f43160a;
    public final o f43161b;

    public l(o oVar, int i10) {
        this.f43160a = i10;
        this.f43161b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f43160a) {
            case 0:
                this.f43161b.dismiss();
                return;
            default:
                this.f43161b.onBackPressed();
                return;
        }
    }
}
