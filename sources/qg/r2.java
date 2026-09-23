package qg;

import org.telegram.messenger.AndroidUtilities;
public final class r2 implements Runnable {
    public final int f41588a;
    public final v2 f41589b;

    public r2(v2 v2Var, int i10) {
        this.f41588a = i10;
        this.f41589b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f41588a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r2(this.f41589b, 0));
                return;
            case 2:
                this.f41589b.dismiss();
                return;
            default:
                v2 v2Var = this.f41589b;
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
