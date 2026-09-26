package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f41891a;
    public final t2 f41892b;

    public p2(t2 t2Var, int i10) {
        this.f41891a = i10;
        this.f41892b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f41891a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f41892b, 0));
                return;
            case 2:
                this.f41892b.dismiss();
                return;
            default:
                t2 t2Var = this.f41892b;
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
