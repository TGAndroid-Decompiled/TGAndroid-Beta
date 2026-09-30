package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f41894a;
    public final t2 f41895b;

    public p2(t2 t2Var, int i10) {
        this.f41894a = i10;
        this.f41895b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f41894a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f41895b, 0));
                return;
            case 2:
                this.f41895b.dismiss();
                return;
            default:
                t2 t2Var = this.f41895b;
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
