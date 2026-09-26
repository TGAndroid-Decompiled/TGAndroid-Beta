package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f46504a;
    public final h4 f46505b;

    public z3(h4 h4Var, int i10) {
        this.f46504a = i10;
        this.f46505b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46504a) {
            case 0:
                this.f46505b.Z();
                return;
            default:
                h4 h4Var = this.f46505b;
                h4Var.f46176i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
