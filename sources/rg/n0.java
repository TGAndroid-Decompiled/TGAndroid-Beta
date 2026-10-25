package rg;

import li.e3;
public final class n0 implements Runnable {
    public final int f47469a;
    public final q0 f47470b;

    public n0(q0 q0Var, int i10) {
        this.f47469a = i10;
        this.f47470b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f47469a) {
            case 0:
                q0 q0Var = this.f47470b;
                q0Var.f47502c = null;
                e3 e3Var = q0Var.f47500a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            default:
                this.f47470b.b();
                return;
        }
    }
}
