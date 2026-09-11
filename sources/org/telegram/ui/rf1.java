package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rf1 extends s4.j {
    public Runnable F;
    public int G;
    public final eg1 H;

    public rf1(eg1 eg1Var) {
        this.H = eg1Var;
    }

    @Override
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().setAnimationInProgress(this.G, null, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.F = null;
            }
        }
    }

    @Override
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        qf1 qf1Var = new qf1(this, 0);
        this.F = qf1Var;
        AndroidUtilities.runOnUIThread(qf1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qf1 qf1Var = new qf1(this, 1);
        this.F = qf1Var;
        AndroidUtilities.runOnUIThread(qf1Var);
    }

    @Override
    public final void z(s4.c1 c1Var) {
        eg1 eg1Var = this.H;
        View view = eg1Var.f36030b1;
        if (view == c1Var.f45738a) {
            view.setTranslationX(0.0f);
            if1 if1Var = eg1Var.O;
            if (if1Var != null) {
                if1Var.F.clear();
            }
            View view2 = eg1Var.f36030b1;
            if (view2 instanceof bg1) {
                bg1 bg1Var = (bg1) view2;
                bg1Var.setTopicIcon(bg1Var.Y4);
            }
            eg1Var.f36030b1 = null;
        }
    }
}
