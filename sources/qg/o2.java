package qg;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f41858a;
    public final s2 f41859b;

    public o2(s2 s2Var, int i10) {
        this.f41858a = i10;
        this.f41859b = s2Var;
    }

    @Override
    public final void run() {
        switch (this.f41858a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2(this.f41859b, 0));
                return;
            case 2:
                this.f41859b.dismiss();
                return;
            default:
                s2 s2Var = this.f41859b;
                ai.y1 y1Var = s2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    s2Var.H = null;
                }
                s2Var.dismiss();
                return;
        }
    }
}
