package yf;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f50055a;
    public final t2 f50056b;

    public o2(t2 t2Var, int i9) {
        this.f50055a = i9;
        this.f50056b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f50055a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2(this.f50056b, 0));
                return;
            case 2:
                this.f50056b.dismiss();
                return;
            default:
                t2 t2Var = this.f50056b;
                bg.i iVar = t2Var.D;
                if (iVar != null) {
                    iVar.run(null);
                    t2Var.D = null;
                }
                t2Var.dismiss();
                return;
        }
    }
}
