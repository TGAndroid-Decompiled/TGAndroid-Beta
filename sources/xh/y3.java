package xh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f51842a;
    public final g4 f51843b;

    public y3(g4 g4Var, int i10) {
        this.f51842a = i10;
        this.f51843b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51842a) {
            case 0:
                this.f51843b.a0();
                return;
            default:
                g4 g4Var = this.f51843b;
                g4Var.f51497i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
