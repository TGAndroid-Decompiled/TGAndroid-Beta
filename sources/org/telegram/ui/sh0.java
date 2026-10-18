package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sh0 implements Runnable {
    public final int f41101a;
    public final ni0 f41102b;

    public sh0(ni0 ni0Var, int i10) {
        this.f41101a = i10;
        this.f41102b = ni0Var;
    }

    @Override
    public final void run() {
        switch (this.f41101a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ni0 ni0Var = this.f41102b;
                ni0Var.getClass();
                wh.f.f(false);
                wh.f fVar = ni0Var.f39460i0;
                if (fVar != null) {
                    fVar.b(ni0Var.F);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                ni0 ni0Var2 = this.f41102b;
                wh.f fVar2 = ni0Var2.f39460i0;
                if (fVar2 != null) {
                    fVar2.b(ni0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
