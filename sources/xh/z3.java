package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f51743a;
    public final h4 f51744b;

    public z3(h4 h4Var, int i10) {
        this.f51743a = i10;
        this.f51744b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51743a) {
            case 0:
                this.f51744b.a0();
                return;
            default:
                h4 h4Var = this.f51744b;
                h4Var.f51397i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
