package qg;

import org.telegram.messenger.AndroidUtilities;
public final class q2 implements Runnable {
    public final int f46467a;
    public final u2 f46468b;

    public q2(u2 u2Var, int i10) {
        this.f46467a = i10;
        this.f46468b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f46467a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q2(this.f46468b, 0));
                return;
            case 2:
                this.f46468b.dismiss();
                return;
            default:
                u2 u2Var = this.f46468b;
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
