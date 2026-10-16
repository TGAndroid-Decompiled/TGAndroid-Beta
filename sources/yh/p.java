package yh;
public final class p implements Runnable {
    public final int f49051a;
    public final w f49052b;

    public p(w wVar, int i10) {
        this.f49051a = i10;
        this.f49052b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f49051a) {
            case 0:
                this.f49052b.onBackPressed();
                return;
            default:
                this.f49052b.U();
                return;
        }
    }
}
