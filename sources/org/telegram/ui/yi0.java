package org.telegram.ui;
public final class yi0 implements Runnable {
    public final int f46029a;
    public final ej0 f46030b;

    public yi0(ej0 ej0Var, int i10) {
        this.f46029a = i10;
        this.f46030b = ej0Var;
    }

    @Override
    public final void run() {
        switch (this.f46029a) {
            case 0:
                this.f46030b.dismiss();
                return;
            case 1:
                this.f46030b.U(true, false);
                return;
            default:
                this.f46030b.U(true, false);
                return;
        }
    }
}
