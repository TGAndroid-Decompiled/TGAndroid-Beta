package yh;
public final class o implements Runnable {
    public final int f50463a;
    public final v f50464b;

    public o(v vVar, int i10) {
        this.f50463a = i10;
        this.f50464b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50463a) {
            case 0:
                this.f50464b.onBackPressed();
                return;
            default:
                this.f50464b.T();
                return;
        }
    }
}
