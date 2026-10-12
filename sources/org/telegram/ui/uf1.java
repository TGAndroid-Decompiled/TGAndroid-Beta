package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uf1 extends s4.j {
    public Runnable F;
    public int G;
    public final hg1 H;

    public uf1(hg1 hg1Var) {
        this.H = hg1Var;
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
        tf1 tf1Var = new tf1(this, 0);
        this.F = tf1Var;
        AndroidUtilities.runOnUIThread(tf1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tf1 tf1Var = new tf1(this, 1);
        this.F = tf1Var;
        AndroidUtilities.runOnUIThread(tf1Var);
    }

    @Override
    public final void z(s4.d1 d1Var) {
        hg1 hg1Var = this.H;
        View view = hg1Var.f38381b1;
        if (view == d1Var.f47889a) {
            view.setTranslationX(0.0f);
            lf1 lf1Var = hg1Var.O;
            if (lf1Var != null) {
                lf1Var.F.clear();
            }
            View view2 = hg1Var.f38381b1;
            if (view2 instanceof eg1) {
                eg1 eg1Var = (eg1) view2;
                eg1Var.setTopicIcon(eg1Var.f37092c5);
            }
            hg1Var.f38381b1 = null;
        }
    }
}
