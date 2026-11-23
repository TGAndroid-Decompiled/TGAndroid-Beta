package org.telegram.ui;
public final class w81 implements Runnable {
    public final int f53200a;
    public final w91 f53201b;

    public w81(w91 w91Var, int i7) {
        this.f53200a = i7;
        this.f53201b = w91Var;
    }

    @Override
    public final void run() {
        switch (this.f53200a) {
            case 0:
                w91 w91Var = this.f53201b;
                w91Var.B0();
                w91Var.F0();
                return;
            case 1:
                this.f53201b.B0();
                return;
            case 2:
                this.f53201b.S0(true);
                return;
            case 3:
                this.f53201b.finishPreviewFragment();
                return;
            case 4:
                w91 w91Var2 = this.f53201b;
                w91Var2.B0 = null;
                w91Var2.Z0(true, false);
                return;
            default:
                w91 w91Var3 = this.f53201b;
                w91Var3.O.postOnAnimation(new w81(w91Var3, 1));
                return;
        }
    }
}
