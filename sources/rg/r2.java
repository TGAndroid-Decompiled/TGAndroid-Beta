package rg;

import org.telegram.messenger.AndroidUtilities;
public final class r2 implements Runnable {
    public final int f45472a;
    public final v2 f45473b;

    public r2(v2 v2Var, int i10) {
        this.f45472a = i10;
        this.f45473b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f45472a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r2(this.f45473b, 0));
                return;
            case 2:
                this.f45473b.dismiss();
                return;
            default:
                v2 v2Var = this.f45473b;
                bi.o1 o1Var = v2Var.H;
                if (o1Var != null) {
                    o1Var.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                return;
        }
    }
}
