package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f45307a;
    public final t2 f45308b;

    public p2(t2 t2Var, int i10) {
        this.f45307a = i10;
        this.f45308b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f45307a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f45308b, 0));
                return;
            case 2:
                this.f45308b.dismiss();
                return;
            default:
                t2 t2Var = this.f45308b;
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
