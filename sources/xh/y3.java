package xh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f51834a;
    public final g4 f51835b;

    public y3(g4 g4Var, int i10) {
        this.f51834a = i10;
        this.f51835b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51834a) {
            case 0:
                this.f51835b.a0();
                return;
            default:
                g4 g4Var = this.f51835b;
                g4Var.f51489i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
