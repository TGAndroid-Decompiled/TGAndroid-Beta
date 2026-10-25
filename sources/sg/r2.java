package sg;

import org.telegram.messenger.AndroidUtilities;
public final class r2 implements Runnable {
    public final int f48489a;
    public final v2 f48490b;

    public r2(v2 v2Var, int i10) {
        this.f48489a = i10;
        this.f48490b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f48489a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r2(this.f48490b, 0));
                return;
            case 2:
                this.f48490b.dismiss();
                return;
            default:
                v2 v2Var = this.f48490b;
                ai.i iVar = v2Var.H;
                if (iVar != null) {
                    iVar.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                return;
        }
    }
}
