package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vf1 extends s4.j {
    public Runnable F;
    public int G;
    public final ig1 H;

    public vf1(ig1 ig1Var) {
        this.H = ig1Var;
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
        uf1 uf1Var = new uf1(this, 0);
        this.F = uf1Var;
        AndroidUtilities.runOnUIThread(uf1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        uf1 uf1Var = new uf1(this, 1);
        this.F = uf1Var;
        AndroidUtilities.runOnUIThread(uf1Var);
    }

    @Override
    public final void z(s4.c1 c1Var) {
        ig1 ig1Var = this.H;
        View view = ig1Var.f33686b1;
        if (view == c1Var.f41610a) {
            view.setTranslationX(0.0f);
            mf1 mf1Var = ig1Var.O;
            if (mf1Var != null) {
                mf1Var.F.clear();
            }
            View view2 = ig1Var.f33686b1;
            if (view2 instanceof fg1) {
                fg1 fg1Var = (fg1) view2;
                fg1Var.setTopicIcon(fg1Var.Y4);
            }
            ig1Var.f33686b1 = null;
        }
    }
}
