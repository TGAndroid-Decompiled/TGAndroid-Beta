package qg;

import ji.w4;
public final class n0 implements Runnable {
    public final int f43234a;
    public final q0 f43235b;

    public n0(q0 q0Var, int i10) {
        this.f43234a = i10;
        this.f43235b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f43234a) {
            case 0:
                q0 q0Var = this.f43235b;
                q0Var.f43265c = null;
                w4 w4Var = q0Var.f43263a;
                if (w4Var != null) {
                    w4Var.Y0();
                    return;
                }
                return;
            default:
                this.f43235b.b();
                return;
        }
    }
}
