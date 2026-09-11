package qg;

import ji.u4;
public final class n0 implements Runnable {
    public final int f44487a;
    public final q0 f44488b;

    public n0(q0 q0Var, int i10) {
        this.f44487a = i10;
        this.f44488b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f44487a) {
            case 0:
                q0 q0Var = this.f44488b;
                q0Var.f44520c = null;
                u4 u4Var = q0Var.f44518a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            default:
                this.f44488b.b();
                return;
        }
    }
}
