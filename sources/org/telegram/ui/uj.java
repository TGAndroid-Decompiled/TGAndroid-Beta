package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class uj extends wh.n {
    public Runnable W;
    public final zn X;

    public uj(zn znVar, zn znVar2, sj sjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(znVar2, sjVar, f6Var);
        this.X = znVar;
    }

    @Override
    public final void F() {
        zn znVar = this.X;
        if (znVar.E9 == -1) {
            znVar.E9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.E9, zn.Kc, false);
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
        tj tjVar = new tj(this, 1);
        this.W = tjVar;
        AndroidUtilities.runOnUIThread(tjVar);
    }

    @Override
    public final void W() {
        zn znVar = this.X;
        znVar.E9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.E9, zn.Kc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = znVar.V.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.re reVar = znVar.V.U3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tj tjVar = new tj(this, 0);
        this.W = tjVar;
        AndroidUtilities.runOnUIThread(tjVar);
    }
}
