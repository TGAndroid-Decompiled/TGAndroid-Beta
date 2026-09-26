package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f46503a;
    public final h4 f46504b;

    public z3(h4 h4Var, int i10) {
        this.f46503a = i10;
        this.f46504b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46503a) {
            case 0:
                this.f46504b.Z();
                return;
            default:
                h4 h4Var = this.f46504b;
                h4Var.f46175i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
