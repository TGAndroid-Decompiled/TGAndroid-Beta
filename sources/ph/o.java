package ph;
public final class o implements Runnable {
    public final int f45253a;
    public final w f45254b;

    public o(w wVar, int i10) {
        this.f45253a = i10;
        this.f45254b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f45253a) {
            case 0:
                this.f45254b.onBackPressed();
                return;
            default:
                this.f45254b.f1();
                return;
        }
    }
}
