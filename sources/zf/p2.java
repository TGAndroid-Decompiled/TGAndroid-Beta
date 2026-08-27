package zf;

import lh.n6;
import org.telegram.messenger.AndroidUtilities;

public final class p2 implements Runnable {

    public final int f50661a;

    public final t2 f50662b;

    public p2(t2 t2Var, int i10) {
        this.f50661a = i10;
        this.f50662b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f50661a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f50662b, 0));
                break;
            case 2:
                this.f50662b.dismiss();
                break;
            default:
                t2 t2Var = this.f50662b;
                n6 n6Var = t2Var.D;
                if (n6Var != null) {
                    n6Var.run(null);
                    t2Var.D = null;
                }
                t2Var.dismiss();
                break;
        }
    }
}
