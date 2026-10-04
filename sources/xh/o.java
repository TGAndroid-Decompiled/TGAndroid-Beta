package xh;
public final class o implements Runnable {
    public final int f50135a;
    public final v f50136b;

    public o(v vVar, int i10) {
        this.f50135a = i10;
        this.f50136b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50135a) {
            case 0:
                this.f50136b.onBackPressed();
                return;
            default:
                this.f50136b.R();
                return;
        }
    }
}
