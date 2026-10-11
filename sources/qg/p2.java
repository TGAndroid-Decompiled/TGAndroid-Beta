package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f46626a;
    public final t2 f46627b;

    public p2(t2 t2Var, int i10) {
        this.f46626a = i10;
        this.f46627b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f46626a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f46627b, 0));
                return;
            case 2:
                this.f46627b.dismiss();
                return;
            default:
                t2 t2Var = this.f46627b;
                ai.y1 y1Var = t2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    t2Var.H = null;
                }
                t2Var.dismiss();
                return;
        }
    }
}
