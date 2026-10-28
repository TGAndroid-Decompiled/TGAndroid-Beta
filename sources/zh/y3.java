package zh;

import org.telegram.messenger.AndroidUtilities;
public final class y3 implements Runnable {
    public final int f53391a;
    public final g4 f53392b;

    public y3(g4 g4Var, int i10) {
        this.f53391a = i10;
        this.f53392b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f53391a) {
            case 0:
                this.f53392b.Z();
                return;
            default:
                g4 g4Var = this.f53392b;
                g4Var.f53079i0.O(true);
                AndroidUtilities.runOnUIThread(new y3(g4Var, 0), 150L);
                return;
        }
    }
}
