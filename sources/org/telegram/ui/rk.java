package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rk extends org.telegram.ui.Components.uj0 {
    public final int[] f42442h1;
    public ValueAnimator f42443i1;
    public boolean f42444j1;
    public final qn f42445k1;

    public rk(qn qnVar, qn qnVar2, Activity activity, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(3, i9, activity, qnVar2, b6Var);
        this.f42445k1 = qnVar;
        this.f42442h1 = new int[2];
        this.f42444j1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.o2) this.f42445k1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.f42442h1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            float f10 = width2 + (dp * i13);
            if (z11) {
                s(f10 - x10, !this.f42444j1);
            } else {
                s(f10 - width, !this.f42444j1);
            }
            this.f42444j1 = false;
        }
    }

    public final void s(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f42443i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42443i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f10);
        this.f42443i1 = ofFloat;
        ofFloat.addUpdateListener(new f3(this, 6));
        this.f42443i1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f42443i1.setDuration(420L);
        this.f42443i1.start();
    }
}
