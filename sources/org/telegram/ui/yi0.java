package org.telegram.ui;
public final class yi0 implements Runnable {
    public final int f43874a;
    public final ej0 f43875b;

    public yi0(ej0 ej0Var, int i10) {
        this.f43874a = i10;
        this.f43875b = ej0Var;
    }

    @Override
    public final void run() {
        switch (this.f43874a) {
            case 0:
                this.f43875b.dismiss();
                return;
            case 1:
                this.f43875b.U(true, false);
                return;
            default:
                this.f43875b.U(true, false);
                return;
        }
    }
}
