package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class sj extends xh.n {
    public Runnable W;
    public final xn X;

    public sj(xn xnVar, xn xnVar2, qj qjVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(xnVar2, qjVar, g6Var);
        this.X = xnVar;
    }

    @Override
    public final void F() {
        xn xnVar = this.X;
        if (xnVar.E9 == -1) {
            xnVar.E9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.E9, xn.Kc, false);
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
        rj rjVar = new rj(this, 1);
        this.W = rjVar;
        AndroidUtilities.runOnUIThread(rjVar);
    }

    @Override
    public final void W() {
        xn xnVar = this.X;
        xnVar.E9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.E9, xn.Kc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.x2 x2Var = xnVar.V.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(x2Var);
        x2Var.run();
        org.telegram.ui.Components.re reVar = xnVar.V.U3;
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
        rj rjVar = new rj(this, 0);
        this.W = rjVar;
        AndroidUtilities.runOnUIThread(rjVar);
    }
}
