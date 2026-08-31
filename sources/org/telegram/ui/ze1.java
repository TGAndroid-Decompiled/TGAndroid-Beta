package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ze1 extends f2.l {
    public Runnable F;
    public int G;
    public final mf1 H;

    public ze1(mf1 mf1Var) {
        this.H = mf1Var;
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
        ye1 ye1Var = new ye1(this, 0);
        this.F = ye1Var;
        AndroidUtilities.runOnUIThread(ye1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ye1 ye1Var = new ye1(this, 1);
        this.F = ye1Var;
        AndroidUtilities.runOnUIThread(ye1Var);
    }

    @Override
    public final void z(f2.m1 m1Var) {
        mf1 mf1Var = this.H;
        View view = mf1Var.Y0;
        if (view == m1Var.f5875a) {
            view.setTranslationX(0.0f);
            pe1 pe1Var = mf1Var.L;
            if (pe1Var != null) {
                pe1Var.C.clear();
            }
            View view2 = mf1Var.Y0;
            if (view2 instanceof jf1) {
                jf1 jf1Var = (jf1) view2;
                jf1Var.setTopicIcon(jf1Var.V4);
            }
            mf1Var.Y0 = null;
        }
    }
}
