package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class yj extends ji.n {
    public Runnable W;
    public final zn X;

    public yj(zn znVar, zn znVar2, wj wjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(znVar2, wjVar, d6Var);
        this.X = znVar;
    }

    @Override
    public final void F() {
        zn znVar = this.X;
        if (znVar.H9 == -1) {
            znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Nc, false);
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
        xj xjVar = new xj(this, 1);
        this.W = xjVar;
        AndroidUtilities.runOnUIThread(xjVar);
    }

    @Override
    public final void W() {
        zn znVar = this.X;
        znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = znVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.df dfVar = znVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        dfVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        xj xjVar = new xj(this, 0);
        this.W = xjVar;
        AndroidUtilities.runOnUIThread(xjVar);
    }
}
