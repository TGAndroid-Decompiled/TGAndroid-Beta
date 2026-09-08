package qg;

import ji.u4;
public final class n0 implements Runnable {
    public final int f44515a;
    public final q0 f44516b;

    public n0(q0 q0Var, int i10) {
        this.f44515a = i10;
        this.f44516b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f44515a) {
            case 0:
                q0 q0Var = this.f44516b;
                q0Var.f44548c = null;
                u4 u4Var = q0Var.f44546a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            default:
                this.f44516b.b();
                return;
        }
    }
}
