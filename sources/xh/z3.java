package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f51620a;
    public final h4 f51621b;

    public z3(h4 h4Var, int i10) {
        this.f51620a = i10;
        this.f51621b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51620a) {
            case 0:
                this.f51621b.a0();
                return;
            default:
                h4 h4Var = this.f51621b;
                h4Var.f51274i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
