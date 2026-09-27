package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f39678a;
    public final boolean f39679b;
    public final org.telegram.ui.Components.w9 f39680c;
    public final wn d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final boolean f39681f;
    public final ai.p4 h;
    public final xn f39682n;

    public xl(xn xnVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, wn wnVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, ai.p4 p4Var) {
        this.f39682n = xnVar;
        this.f39678a = z10;
        this.f39679b = z11;
        this.f39680c = w9Var;
        this.d = wnVar;
        this.e = j5Var;
        this.f39681f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        xn xnVar = this.f39682n;
        xnVar.H2[1] = null;
        xnVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f39682n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f39680c;
            boolean z10 = this.f39679b;
            boolean z11 = this.f39678a;
            if (!z11 && !z10 && w9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.sr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f39681f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new v4(this, 20));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
