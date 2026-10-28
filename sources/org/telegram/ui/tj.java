package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tj extends mi.m {
    public Runnable W;
    public final wn X;

    public tj(wn wnVar, wn wnVar2, rj rjVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(wnVar2, rjVar, u6Var);
        this.X = wnVar;
    }

    @Override
    public final void F() {
        wn wnVar = this.X;
        if (wnVar.X9 == -1) {
            wnVar.X9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.X9, wn.f45041ld, false);
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
        wn wnVar = this.X;
        wnVar.X9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.X9, wn.f45041ld, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.z2 z2Var = wnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(z2Var);
        z2Var.run();
        org.telegram.ui.Components.af afVar = wnVar.Y.Y3;
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
