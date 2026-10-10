package qg;

import org.telegram.messenger.AndroidUtilities;
public final class q2 implements Runnable {
    public final int f46566a;
    public final u2 f46567b;

    public q2(u2 u2Var, int i10) {
        this.f46566a = i10;
        this.f46567b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f46566a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q2(this.f46567b, 0));
                return;
            case 2:
                this.f46567b.dismiss();
                return;
            default:
                u2 u2Var = this.f46567b;
                ai.y1 y1Var = u2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                return;
        }
    }
}
