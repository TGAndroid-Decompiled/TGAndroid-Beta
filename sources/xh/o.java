package xh;
public final class o implements Runnable {
    public final int f50136a;
    public final v f50137b;

    public o(v vVar, int i10) {
        this.f50136a = i10;
        this.f50137b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50136a) {
            case 0:
                this.f50137b.onBackPressed();
                return;
            default:
                this.f50137b.R();
                return;
        }
    }
}
