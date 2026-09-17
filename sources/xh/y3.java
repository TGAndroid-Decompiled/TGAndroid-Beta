package xh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f46233a;
    public final g4 f46234b;

    public y3(g4 g4Var, int i10) {
        this.f46233a = i10;
        this.f46234b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46233a) {
            case 0:
                this.f46234b.Z();
                return;
            default:
                g4 g4Var = this.f46234b;
                g4Var.f45910i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
