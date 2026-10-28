package sg;

import org.telegram.messenger.AndroidUtilities;
public final class q2 implements Runnable {
    public final int f48517a;
    public final u2 f48518b;

    public q2(u2 u2Var, int i10) {
        this.f48517a = i10;
        this.f48518b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f48517a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q2(this.f48518b, 0));
                return;
            case 2:
                this.f48518b.dismiss();
                return;
            default:
                u2 u2Var = this.f48518b;
                ai.i iVar = u2Var.H;
                if (iVar != null) {
                    iVar.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                return;
        }
    }
}
