package rg;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f45587a;
    public final s2 f45588b;

    public o2(s2 s2Var, int i10) {
        this.f45587a = i10;
        this.f45588b = s2Var;
    }

    @Override
    public final void run() {
        switch (this.f45587a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2(this.f45588b, 0));
                return;
            case 2:
                this.f45588b.dismiss();
                return;
            default:
                s2 s2Var = this.f45588b;
                ai.r0 r0Var = s2Var.H;
                if (r0Var != null) {
                    r0Var.run(null);
                    s2Var.H = null;
                }
                s2Var.dismiss();
                return;
        }
    }
}
