package yh;
public final class o implements Runnable {
    public final int f50416a;
    public final v f50417b;

    public o(v vVar, int i10) {
        this.f50416a = i10;
        this.f50417b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50416a) {
            case 0:
                this.f50417b.onBackPressed();
                return;
            default:
                this.f50417b.U();
                return;
        }
    }
}
