package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f46477a;
    public final h4 f46478b;

    public z3(h4 h4Var, int i10) {
        this.f46477a = i10;
        this.f46478b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46477a) {
            case 0:
                this.f46478b.Z();
                return;
            default:
                h4 h4Var = this.f46478b;
                h4Var.f46149i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
