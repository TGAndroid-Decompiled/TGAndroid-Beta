package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wj extends ji.n {
    public Runnable W;
    public final bo X;

    public wj(bo boVar, bo boVar2, uj ujVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(boVar2, ujVar, e6Var);
        this.X = boVar;
    }

    @Override
    public final void F() {
        bo boVar = this.X;
        if (boVar.H9 == -1) {
            boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Nc, false);
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
        vj vjVar = new vj(this, 1);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
    }

    @Override
    public final void W() {
        bo boVar = this.X;
        boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = boVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
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
        vj vjVar = new vj(this, 0);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
    }
}
