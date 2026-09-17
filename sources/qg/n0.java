package qg;

import ji.u4;
public final class n0 implements Runnable {
    public final int f44488a;
    public final q0 f44489b;

    public n0(q0 q0Var, int i10) {
        this.f44488a = i10;
        this.f44489b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f44488a) {
            case 0:
                q0 q0Var = this.f44489b;
                q0Var.f44521c = null;
                u4 u4Var = q0Var.f44519a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            default:
                this.f44489b.b();
                return;
        }
    }
}
