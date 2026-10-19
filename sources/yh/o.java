package yh;
public final class o implements Runnable {
    public final int f50415a;
    public final v f50416b;

    public o(v vVar, int i10) {
        this.f50415a = i10;
        this.f50416b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50415a) {
            case 0:
                this.f50416b.onBackPressed();
                return;
            default:
                this.f50416b.U();
                return;
        }
    }
}
