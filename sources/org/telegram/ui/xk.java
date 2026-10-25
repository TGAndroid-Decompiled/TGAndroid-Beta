package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xk extends org.telegram.ui.Components.fl0 {
    public final int[] f45790m1;
    public ValueAnimator f45791n1;
    public boolean f45792o1;
    public final un f45793p1;

    public xk(un unVar, un unVar2, Activity activity, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(3, i10, activity, unVar2, u6Var);
        this.f45793p1 = unVar;
        this.f45790m1 = new int[2];
        this.f45792o1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.r2) this.f45793p1).actionBar;
        org.telegram.ui.ActionBar.w0 j10 = kVar.i(null).j(28);
        if (j10 != null) {
            int[] iArr = this.f45790m1;
            getLocationInWindow(iArr);
            float x9 = getX();
            float width = getWidth() + x9;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f7 = width2 + (dp * i14);
            if (z11) {
                s(f7 - x9, !this.f45792o1);
            } else {
                s(f7 - width, !this.f45792o1);
            }
            this.f45792o1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.f45791n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45791n1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.f45791n1 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        this.f45791n1.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f45791n1.setDuration(420L);
        this.f45791n1.start();
    }
}
