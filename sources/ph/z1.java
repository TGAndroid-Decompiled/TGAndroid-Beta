package ph;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f42683a;
    public final d2 f42684b;
    public final org.telegram.ui.web.a1 f42685c;

    public z1(d2 d2Var, org.telegram.ui.web.a1 a1Var, int i10) {
        this.f42683a = i10;
        this.f42684b = d2Var;
        this.f42685c = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f42683a) {
            case 0:
                d2 d2Var = this.f42684b;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new z1(d2Var, this.f42685c, 1), 320L);
                return;
            default:
                d2 d2Var2 = this.f42684b;
                d2Var2.getClass();
                this.f42685c.run(new org.telegram.ui.web.a1(d2Var2, 6));
                return;
        }
    }
}
