package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class wk extends org.telegram.ui.Components.fl0 {
    public final int[] f43366m1;
    public ValueAnimator f43367n1;
    public boolean f43368o1;
    public final sn f43369p1;

    public wk(sn snVar, sn snVar2, Activity activity, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i10, activity, snVar2, g6Var);
        this.f43369p1 = snVar;
        this.f43366m1 = new int[2];
        this.f43368o1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.o2) this.f43369p1).actionBar;
        org.telegram.ui.ActionBar.u0 k10 = kVar.i(null).k(28);
        if (k10 != null) {
            int[] iArr = this.f43366m1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f7 = width2 + (dp * i14);
            if (z11) {
                s(f7 - x10, !this.f43368o1);
            } else {
                s(f7 - width, !this.f43368o1);
            }
            this.f43368o1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.f43367n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43367n1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.f43367n1 = ofFloat;
        ofFloat.addUpdateListener(new d3(this, 6));
        this.f43367n1.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f43367n1.setDuration(420L);
        this.f43367n1.start();
    }
}
