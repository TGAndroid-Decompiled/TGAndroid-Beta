package ph;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f42643a;
    public final d2 f42644b;
    public final org.telegram.ui.web.y0 f42645c;

    public z1(d2 d2Var, org.telegram.ui.web.y0 y0Var, int i10) {
        this.f42643a = i10;
        this.f42644b = d2Var;
        this.f42645c = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f42643a) {
            case 0:
                d2 d2Var = this.f42644b;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new z1(d2Var, this.f42645c, 1), 320L);
                return;
            default:
                d2 d2Var2 = this.f42644b;
                d2Var2.getClass();
                this.f42645c.run(new org.telegram.ui.web.y0(d2Var2, 6));
                return;
        }
    }
}
