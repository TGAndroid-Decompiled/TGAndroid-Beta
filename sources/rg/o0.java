package rg;

import a8.ng;
public final class o0 implements Runnable {
    public final int f47476a;
    public final q0 f47477b;
    public final ng f47478c;

    public o0(q0 q0Var, ng ngVar, int i10) {
        this.f47476a = i10;
        this.f47477b = q0Var;
        this.f47478c = ngVar;
    }

    @Override
    public final void run() {
        switch (this.f47476a) {
            case 0:
                this.f47477b.p(this.f47478c, true);
                return;
            default:
                q0 q0Var = this.f47477b;
                q0Var.f47503f.f(new o0(q0Var, this.f47478c, 0));
                return;
        }
    }
}
