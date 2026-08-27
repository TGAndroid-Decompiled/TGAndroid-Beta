package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class tk extends org.telegram.ui.Components.wj0 {

    public final int[] f42955h1;

    public ValueAnimator f42956i1;

    public boolean f42957j1;

    public final rn f42958k1;

    public tk(rn rnVar, rn rnVar2, Activity activity, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, activity, rnVar2, c6Var);
        this.f42958k1 = rnVar;
        this.f42955h1 = new int[2];
        this.f42957j1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.ActionBar.v0 v0VarK = ((org.telegram.ui.ActionBar.n2) this.f42958k1).actionBar.j(null).k(28);
        if (v0VarK != null) {
            int[] iArr = this.f42955h1;
            getLocationInWindow(iArr);
            float x8 = getX();
            float width = getWidth() + x8;
            v0VarK.getLocationInWindow(iArr);
            float width2 = (v0VarK.getWidth() / 2.0f) + iArr[0];
            int iDp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f10 = width2 + (iDp * (z11 ? -1 : 1));
            if (z11) {
                s(f10 - x8, !this.f42957j1);
            } else {
                s(f10 - width, !this.f42957j1);
            }
            this.f42957j1 = false;
        }
    }

    public final void s(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f42956i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42956i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.Q0, f10);
        this.f42956i1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g3(this, 6));
        this.f42956i1.setInterpolator(org.telegram.ui.Components.er.h);
        this.f42956i1.setDuration(420L);
        this.f42956i1.start();
    }
}
