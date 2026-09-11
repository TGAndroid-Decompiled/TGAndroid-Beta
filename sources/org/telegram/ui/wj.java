package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class wj extends ki.o {
    public Runnable W;
    public final co X;

    public wj(co coVar, co coVar2, uj ujVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(coVar2, ujVar, f6Var);
        this.X = coVar;
    }

    @Override
    public final void F() {
        co coVar = this.X;
        if (coVar.H9 == -1) {
            coVar.H9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.H9, co.Nc, false);
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
        co coVar = this.X;
        coVar.H9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.H9, co.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = coVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.bf bfVar = coVar.Y.X3;
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
        vj vjVar = new vj(this, 0);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
    }
}
