package zh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f53330a;
    public final g4 f53331b;

    public y3(g4 g4Var, int i10) {
        this.f53330a = i10;
        this.f53331b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f53330a) {
            case 0:
                this.f53331b.Z();
                return;
            default:
                g4 g4Var = this.f53331b;
                g4Var.f53018i0.O(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
