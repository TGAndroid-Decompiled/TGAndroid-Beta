package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vj extends ji.n {
    public Runnable W;
    public final xn X;

    public vj(xn xnVar, xn xnVar2, tj tjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(xnVar2, tjVar, e6Var);
        this.X = xnVar;
    }

    @Override
    public final void F() {
        xn xnVar = this.X;
        if (xnVar.H9 == -1) {
            xnVar.H9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.H9, xn.Mc, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        uj ujVar = new uj(this, 1);
        this.W = ujVar;
        AndroidUtilities.runOnUIThread(ujVar);
    }

    @Override
    public final void W() {
        xn xnVar = this.X;
        xnVar.H9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.H9, xn.Mc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = xnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.bf bfVar = xnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        uj ujVar = new uj(this, 0);
        this.W = ujVar;
        AndroidUtilities.runOnUIThread(ujVar);
    }
}
