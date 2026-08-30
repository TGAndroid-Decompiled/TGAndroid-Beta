package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f39931a;
    public final boolean f39932b;
    public final org.telegram.ui.Components.p9 f39933c;
    public final wn d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final boolean f39934f;
    public final gg.q h;
    public final xn f39935n;

    public xl(xn xnVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, wn wnVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, gg.q qVar) {
        this.f39935n = xnVar;
        this.f39931a = z4;
        this.f39932b = z10;
        this.f39933c = p9Var;
        this.d = wnVar;
        this.e = k5Var;
        this.f39934f = z11;
        this.h = qVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        xn xnVar = this.f39935n;
        xnVar.E2[1] = null;
        xnVar.f40250y2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f39935n.E2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.f39933c;
            boolean z4 = this.f39932b;
            boolean z10 = this.f39931a;
            if (!z10 && !z4 && p9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.nr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f39934f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new s5(this, 19));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
