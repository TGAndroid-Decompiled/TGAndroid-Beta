package qh;

import org.telegram.messenger.AndroidUtilities;
public final class y1 implements Runnable {
    public final int f46352a;
    public final c2 f46353b;
    public final org.telegram.ui.web.d1 f46354c;

    public y1(c2 c2Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.f46352a = i10;
        this.f46353b = c2Var;
        this.f46354c = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f46352a) {
            case 0:
                c2 c2Var = this.f46353b;
                c2Var.getClass();
                AndroidUtilities.runOnUIThread(new y1(c2Var, this.f46354c, 1), 320L);
                return;
            default:
                c2 c2Var2 = this.f46353b;
                c2Var2.getClass();
                this.f46354c.run(new org.telegram.ui.web.d1(c2Var2, 6));
                return;
        }
    }
}
