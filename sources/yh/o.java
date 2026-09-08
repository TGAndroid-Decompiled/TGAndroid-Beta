package yh;
public final class o implements Runnable {
    public final int f50492a;
    public final v f50493b;

    public o(v vVar, int i10) {
        this.f50492a = i10;
        this.f50493b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50492a) {
            case 0:
                this.f50493b.onBackPressed();
                return;
            default:
                this.f50493b.T();
                return;
        }
    }
}
