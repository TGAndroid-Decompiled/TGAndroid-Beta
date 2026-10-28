package rg;

import a8.ng;
public final class o0 implements Runnable {
    public final int f47514a;
    public final q0 f47515b;
    public final ng f47516c;

    public o0(q0 q0Var, ng ngVar, int i10) {
        this.f47514a = i10;
        this.f47515b = q0Var;
        this.f47516c = ngVar;
    }

    @Override
    public final void run() {
        switch (this.f47514a) {
            case 0:
                this.f47515b.p(this.f47516c, true);
                return;
            default:
                q0 q0Var = this.f47515b;
                q0Var.f47541f.f(new o0(q0Var, this.f47516c, 0));
                return;
        }
    }
}
