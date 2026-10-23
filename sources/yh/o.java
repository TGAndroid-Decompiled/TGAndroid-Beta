package yh;
public final class o implements Runnable {
    public final int f50883a;
    public final v f50884b;

    public o(v vVar, int i10) {
        this.f50883a = i10;
        this.f50884b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50883a) {
            case 0:
                this.f50884b.onBackPressed();
                return;
            default:
                this.f50884b.T();
                return;
        }
    }
}
