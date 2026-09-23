package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tj extends ji.n {
    public Runnable W;
    public final xn X;

    public tj(xn xnVar, xn xnVar2, rj rjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(xnVar2, rjVar, d6Var);
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
        sj sjVar = new sj(this, 1);
        this.W = sjVar;
        AndroidUtilities.runOnUIThread(sjVar);
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
        org.telegram.ui.ActionBar.v2 v2Var = xnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.af afVar = xnVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        sj sjVar = new sj(this, 0);
        this.W = sjVar;
        AndroidUtilities.runOnUIThread(sjVar);
    }
}
