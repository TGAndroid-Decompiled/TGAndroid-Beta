package yh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f50636a;
    public final g4 f50637b;

    public y3(g4 g4Var, int i10) {
        this.f50636a = i10;
        this.f50637b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50636a) {
            case 0:
                this.f50637b.a0();
                return;
            default:
                g4 g4Var = this.f50637b;
                g4Var.f50302i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
