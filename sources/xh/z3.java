package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f51709a;
    public final h4 f51710b;

    public z3(h4 h4Var, int i10) {
        this.f51709a = i10;
        this.f51710b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51709a) {
            case 0:
                this.f51710b.a0();
                return;
            default:
                h4 h4Var = this.f51710b;
                h4Var.f51363i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
