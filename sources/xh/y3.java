package xh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f46238a;
    public final g4 f46239b;

    public y3(g4 g4Var, int i10) {
        this.f46238a = i10;
        this.f46239b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46238a) {
            case 0:
                this.f46239b.Z();
                return;
            default:
                g4 g4Var = this.f46239b;
                g4Var.f45915i0.N(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
