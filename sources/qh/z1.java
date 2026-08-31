package qh;

import org.telegram.messenger.AndroidUtilities;
public final class z1 implements Runnable {
    public final int f46370a;
    public final d2 f46371b;
    public final org.telegram.ui.web.d1 f46372c;

    public z1(d2 d2Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.f46370a = i10;
        this.f46371b = d2Var;
        this.f46372c = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f46370a) {
            case 0:
                d2 d2Var = this.f46371b;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new z1(d2Var, this.f46372c, 1), 320L);
                return;
            default:
                d2 d2Var2 = this.f46371b;
                d2Var2.getClass();
                this.f46372c.run(new org.telegram.ui.web.d1(d2Var2, 6));
                return;
        }
    }
}
