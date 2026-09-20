package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f46524a;
    public final h4 f46525b;

    public z3(h4 h4Var, int i10) {
        this.f46524a = i10;
        this.f46525b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46524a) {
            case 0:
                this.f46525b.Z();
                return;
            default:
                h4 h4Var = this.f46525b;
                h4Var.f46196i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
