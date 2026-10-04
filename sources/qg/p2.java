package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f45292a;
    public final t2 f45293b;

    public p2(t2 t2Var, int i10) {
        this.f45292a = i10;
        this.f45293b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f45292a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f45293b, 0));
                return;
            case 2:
                this.f45293b.dismiss();
                return;
            default:
                t2 t2Var = this.f45293b;
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
