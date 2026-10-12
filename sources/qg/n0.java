package qg;

import ji.h5;
public final class n0 implements Runnable {
    public final int f43492a;
    public final q0 f43493b;

    public n0(q0 q0Var, int i10) {
        this.f43492a = i10;
        this.f43493b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f43492a) {
            case 0:
                q0 q0Var = this.f43493b;
                q0Var.f43523c = null;
                h5 h5Var = q0Var.f43521a;
                if (h5Var != null) {
                    h5Var.Q0();
                    return;
                }
                return;
            default:
                this.f43493b.b();
                return;
        }
    }
}
