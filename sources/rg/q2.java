package rg;

import org.telegram.messenger.AndroidUtilities;
public final class q2 implements Runnable {
    public final int f46041a;
    public final u2 f46042b;

    public q2(u2 u2Var, int i10) {
        this.f46041a = i10;
        this.f46042b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f46041a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q2(this.f46042b, 0));
                return;
            case 2:
                this.f46042b.dismiss();
                return;
            default:
                u2 u2Var = this.f46042b;
                ai.r0 r0Var = u2Var.H;
                if (r0Var != null) {
                    r0Var.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                return;
        }
    }
}
