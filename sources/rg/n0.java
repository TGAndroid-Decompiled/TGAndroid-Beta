package rg;

import li.e3;
public final class n0 implements Runnable {
    public final int f47507a;
    public final q0 f47508b;

    public n0(q0 q0Var, int i10) {
        this.f47507a = i10;
        this.f47508b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f47507a) {
            case 0:
                q0 q0Var = this.f47508b;
                q0Var.f47540c = null;
                e3 e3Var = q0Var.f47538a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            default:
                this.f47508b.b();
                return;
        }
    }
}
