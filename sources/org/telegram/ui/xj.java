package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xj extends ji.n {
    public Runnable W;
    public final bo X;

    public xj(bo boVar, bo boVar2, vj vjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(boVar2, vjVar, f6Var);
        this.X = boVar;
    }

    @Override
    public final void F() {
        bo boVar = this.X;
        if (boVar.H9 == -1) {
            boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Mc, false);
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
        wj wjVar = new wj(this, 1);
        this.W = wjVar;
        AndroidUtilities.runOnUIThread(wjVar);
    }

    @Override
    public final void W() {
        bo boVar = this.X;
        boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Mc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = boVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.ye yeVar = boVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(yeVar);
        yeVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        wj wjVar = new wj(this, 0);
        this.W = wjVar;
        AndroidUtilities.runOnUIThread(wjVar);
    }
}
