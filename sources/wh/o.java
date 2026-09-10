package wh;
public final class o implements Runnable {
    public final int f44271a;
    public final w f44272b;

    public o(w wVar, int i10) {
        this.f44271a = i10;
        this.f44272b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f44271a) {
            case 0:
                this.f44272b.onBackPressed();
                return;
            default:
                this.f44272b.T();
                return;
        }
    }
}
