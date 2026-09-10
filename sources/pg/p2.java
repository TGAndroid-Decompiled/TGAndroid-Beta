package pg;

import org.telegram.messenger.AndroidUtilities;
public final class p2 implements Runnable {
    public final int f40255a;
    public final t2 f40256b;

    public p2(t2 t2Var, int i10) {
        this.f40255a = i10;
        this.f40256b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f40255a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.f40256b, 0));
                return;
            case 2:
                this.f40256b.dismiss();
                return;
            default:
                t2 t2Var = this.f40256b;
                ai.b bVar = t2Var.H;
                if (bVar != null) {
                    bVar.run(null);
                    t2Var.H = null;
                }
                t2Var.dismiss();
                return;
        }
    }
}
