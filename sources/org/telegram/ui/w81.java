package org.telegram.ui;
public final class w81 implements Runnable {
    public final int f51026a;
    public final v91 f51027b;

    public w81(v91 v91Var, int i7) {
        this.f51026a = i7;
        this.f51027b = v91Var;
    }

    @Override
    public final void run() {
        switch (this.f51026a) {
            case 0:
                v91 v91Var = this.f51027b;
                v91Var.B0();
                v91Var.F0();
                return;
            case 1:
                this.f51027b.B0();
                return;
            case 2:
                this.f51027b.S0(true);
                return;
            case 3:
                this.f51027b.finishPreviewFragment();
                return;
            case 4:
                v91 v91Var2 = this.f51027b;
                v91Var2.A0 = null;
                v91Var2.Z0(true, false);
                return;
            default:
                v91 v91Var3 = this.f51027b;
                v91Var3.N.postOnAnimation(new w81(v91Var3, 1));
                return;
        }
    }
}
