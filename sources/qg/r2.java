package qg;

import org.telegram.messenger.AndroidUtilities;
public final class r2 implements Runnable {
    public final int f41632a;
    public final v2 f41633b;

    public r2(v2 v2Var, int i10) {
        this.f41632a = i10;
        this.f41633b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f41632a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r2(this.f41633b, 0));
                return;
            case 2:
                this.f41633b.dismiss();
                return;
            default:
                v2 v2Var = this.f41633b;
                ai.y1 y1Var = v2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                return;
        }
    }
}
