package rg;

import li.e3;
public final class n0 implements Runnable {
    public final int f47472a;
    public final q0 f47473b;

    public n0(q0 q0Var, int i10) {
        this.f47472a = i10;
        this.f47473b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f47472a) {
            case 0:
                q0 q0Var = this.f47473b;
                q0Var.f47505c = null;
                e3 e3Var = q0Var.f47503a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            default:
                this.f47473b.b();
                return;
        }
    }
}
