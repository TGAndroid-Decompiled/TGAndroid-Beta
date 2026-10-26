package rg;

import a8.ng;
public final class o0 implements Runnable {
    public final int f47479a;
    public final q0 f47480b;
    public final ng f47481c;

    public o0(q0 q0Var, ng ngVar, int i10) {
        this.f47479a = i10;
        this.f47480b = q0Var;
        this.f47481c = ngVar;
    }

    @Override
    public final void run() {
        switch (this.f47479a) {
            case 0:
                this.f47480b.p(this.f47481c, true);
                return;
            default:
                q0 q0Var = this.f47480b;
                q0Var.f47506f.f(new o0(q0Var, this.f47481c, 0));
                return;
        }
    }
}
