package yh;
public final class p implements Runnable {
    public final int f50451a;
    public final w f50452b;

    public p(w wVar, int i10) {
        this.f50451a = i10;
        this.f50452b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f50451a) {
            case 0:
                this.f50452b.onBackPressed();
                return;
            default:
                this.f50452b.U();
                return;
        }
    }
}
