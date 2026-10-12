package yh;
public final class p implements Runnable {
    public final int f49052a;
    public final w f49053b;

    public p(w wVar, int i10) {
        this.f49052a = i10;
        this.f49053b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f49052a) {
            case 0:
                this.f49053b.onBackPressed();
                return;
            default:
                this.f49053b.U();
                return;
        }
    }
}
