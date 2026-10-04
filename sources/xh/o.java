package xh;
public final class o implements Runnable {
    public final int f50144a;
    public final v f50145b;

    public o(v vVar, int i10) {
        this.f50144a = i10;
        this.f50145b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50144a) {
            case 0:
                this.f50145b.onBackPressed();
                return;
            default:
                this.f50145b.R();
                return;
        }
    }
}
