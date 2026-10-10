package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sf1 extends s4.j {
    public Runnable F;
    public int G;
    public final fg1 H;

    public sf1(fg1 fg1Var) {
        this.H = fg1Var;
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
        rf1 rf1Var = new rf1(this, 0);
        this.F = rf1Var;
        AndroidUtilities.runOnUIThread(rf1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rf1 rf1Var = new rf1(this, 1);
        this.F = rf1Var;
        AndroidUtilities.runOnUIThread(rf1Var);
    }

    @Override
    public final void z(s4.d1 d1Var) {
        fg1 fg1Var = this.H;
        View view = fg1Var.f37607b1;
        if (view == d1Var.f47702a) {
            view.setTranslationX(0.0f);
            jf1 jf1Var = fg1Var.O;
            if (jf1Var != null) {
                jf1Var.F.clear();
            }
            View view2 = fg1Var.f37607b1;
            if (view2 instanceof cg1) {
                cg1 cg1Var = (cg1) view2;
                cg1Var.setTopicIcon(cg1Var.f36703c5);
            }
            fg1Var.f37607b1 = null;
        }
    }
}
