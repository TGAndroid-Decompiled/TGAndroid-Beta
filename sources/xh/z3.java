package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f50325a;
    public final h4 f50326b;

    public z3(h4 h4Var, int i10) {
        this.f50325a = i10;
        this.f50326b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f50325a) {
            case 0:
                this.f50326b.Y();
                return;
            default:
                h4 h4Var = this.f50326b;
                h4Var.f49981i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
