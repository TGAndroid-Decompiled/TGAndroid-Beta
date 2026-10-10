package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f51666a;
    public final h4 f51667b;

    public z3(h4 h4Var, int i10) {
        this.f51666a = i10;
        this.f51667b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51666a) {
            case 0:
                this.f51667b.a0();
                return;
            default:
                h4 h4Var = this.f51667b;
                h4Var.f51320i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
