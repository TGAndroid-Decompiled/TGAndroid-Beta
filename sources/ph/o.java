package ph;
public final class o implements Runnable {
    public final int f45264a;
    public final w f45265b;

    public o(w wVar, int i10) {
        this.f45264a = i10;
        this.f45265b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f45264a) {
            case 0:
                this.f45265b.onBackPressed();
                return;
            default:
                this.f45265b.f1();
                return;
        }
    }
}
