package qg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f46592a;
    public final t2 f46593b;

    public p2(t2 t2Var, int i10) {
        this.f46592a = i10;
        this.f46593b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f46592a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f46593b, 0));
                return;
            case 2:
                this.f46593b.dismiss();
                return;
            default:
                t2 t2Var = this.f46593b;
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
