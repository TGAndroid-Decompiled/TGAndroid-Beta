package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class rj extends li.m {
    public Runnable W;
    public final sn X;

    public rj(sn snVar, sn snVar2, pj pjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(snVar2, pjVar, d6Var);
        this.X = snVar;
    }

    @Override
    public final void F() {
        sn snVar = this.X;
        if (snVar.H9 == -1) {
            snVar.H9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.H9, sn.Nc, false);
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
        qj qjVar = new qj(this, 1);
        this.W = qjVar;
        AndroidUtilities.runOnUIThread(qjVar);
    }

    @Override
    public final void W() {
        sn snVar = this.X;
        snVar.H9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.H9, sn.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = snVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.af afVar = snVar.Y.Y3;
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
        qj qjVar = new qj(this, 0);
        this.W = qjVar;
        AndroidUtilities.runOnUIThread(qjVar);
    }
}
