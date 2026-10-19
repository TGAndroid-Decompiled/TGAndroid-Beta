package yh;
public final class o implements Runnable {
    public final int f50417a;
    public final v f50418b;

    public o(v vVar, int i10) {
        this.f50417a = i10;
        this.f50418b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50417a) {
            case 0:
                this.f50418b.onBackPressed();
                return;
            default:
                this.f50418b.U();
                return;
        }
    }
}
