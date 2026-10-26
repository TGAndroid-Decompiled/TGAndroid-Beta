package zh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f53333a;
    public final g4 f53334b;

    public y3(g4 g4Var, int i10) {
        this.f53333a = i10;
        this.f53334b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f53333a) {
            case 0:
                this.f53334b.Z();
                return;
            default:
                g4 g4Var = this.f53334b;
                g4Var.f53021i0.O(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
