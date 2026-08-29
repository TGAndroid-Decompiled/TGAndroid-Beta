package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uk extends org.telegram.ui.Components.fk0 {
    public final int[] f43276h1;
    public ValueAnimator f43277i1;
    public boolean f43278j1;
    public final tn f43279k1;

    public uk(tn tnVar, tn tnVar2, Activity activity, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, activity, tnVar2, c6Var);
        this.f43279k1 = tnVar;
        this.f43276h1 = new int[2];
        this.f43278j1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        lVar = ((org.telegram.ui.ActionBar.o2) this.f43279k1).actionBar;
        org.telegram.ui.ActionBar.w0 k9 = lVar.j(null).k(28);
        if (k9 != null) {
            int[] iArr = this.f43276h1;
            getLocationInWindow(iArr);
            float x4 = getX();
            float width = getWidth() + x4;
            k9.getLocationInWindow(iArr);
            float width2 = (k9.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f9 = width2 + (dp * i14);
            if (z11) {
                s(f9 - x4, !this.f43278j1);
            } else {
                s(f9 - width, !this.f43278j1);
            }
            this.f43278j1 = false;
        }
    }

    public final void s(float f9, boolean z10) {
        ValueAnimator valueAnimator = this.f43277i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43277i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f9);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f9);
        this.f43277i1 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 6));
        this.f43277i1.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f43277i1.setDuration(420L);
        this.f43277i1.start();
    }
}
