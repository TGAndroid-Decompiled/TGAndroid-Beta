package yh;
public final class p implements Runnable {
    public final int f50476a;
    public final w f50477b;

    public p(w wVar, int i10) {
        this.f50476a = i10;
        this.f50477b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f50476a) {
            case 0:
                this.f50477b.onBackPressed();
                return;
            default:
                this.f50477b.U();
                return;
        }
    }
}
