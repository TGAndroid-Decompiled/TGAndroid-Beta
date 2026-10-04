package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f45293a;
    public final t2 f45294b;

    public p2(t2 t2Var, int i10) {
        this.f45293a = i10;
        this.f45294b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f45293a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f45294b, 0));
                return;
            case 2:
                this.f45294b.dismiss();
                return;
            default:
                t2 t2Var = this.f45294b;
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
