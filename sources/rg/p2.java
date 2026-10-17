package rg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f45623a;
    public final t2 f45624b;

    public p2(t2 t2Var, int i10) {
        this.f45623a = i10;
        this.f45624b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f45623a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f45624b, 0));
                return;
            case 2:
                this.f45624b.dismiss();
                return;
            default:
                t2 t2Var = this.f45624b;
                ai.r0 r0Var = t2Var.H;
                if (r0Var != null) {
                    r0Var.run(null);
                    t2Var.H = null;
                }
                t2Var.dismiss();
                return;
        }
    }
}
