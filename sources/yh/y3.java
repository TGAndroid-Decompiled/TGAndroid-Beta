package yh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f50611a;
    public final g4 f50612b;

    public y3(g4 g4Var, int i10) {
        this.f50611a = i10;
        this.f50612b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50611a) {
            case 0:
                this.f50612b.a0();
                return;
            default:
                g4 g4Var = this.f50612b;
                g4Var.f50277i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
