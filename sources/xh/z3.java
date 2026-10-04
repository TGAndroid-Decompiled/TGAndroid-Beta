package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f50334a;
    public final h4 f50335b;

    public z3(h4 h4Var, int i10) {
        this.f50334a = i10;
        this.f50335b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f50334a) {
            case 0:
                this.f50335b.Y();
                return;
            default:
                h4 h4Var = this.f50335b;
                h4Var.f49990i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
