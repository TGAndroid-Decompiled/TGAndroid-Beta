package wh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f44438a;
    public final g4 f44439b;

    public y3(g4 g4Var, int i10) {
        this.f44438a = i10;
        this.f44439b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f44438a) {
            case 0:
                this.f44439b.Z();
                return;
            default:
                g4 g4Var = this.f44439b;
                g4Var.f44110i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
