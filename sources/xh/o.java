package xh;
public final class o implements Runnable {
    public final int f45987a;
    public final v f45988b;

    public o(v vVar, int i10) {
        this.f45987a = i10;
        this.f45988b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f45987a) {
            case 0:
                this.f45988b.onBackPressed();
                return;
            default:
                this.f45988b.T();
                return;
        }
    }
}
