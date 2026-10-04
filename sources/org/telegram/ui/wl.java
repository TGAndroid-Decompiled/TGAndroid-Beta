package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class wl extends AnimatorListenerAdapter {
    public final boolean f42527a;
    public final boolean f42528b;
    public final org.telegram.ui.Components.w9 f42529c;
    public final xn d;
    public final org.telegram.ui.ActionBar.i5 f42530e;
    public final boolean f42531f;
    public final ai.p4 h;
    public final yn f42532n;

    public wl(yn ynVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, xn xnVar, org.telegram.ui.ActionBar.i5 i5Var, boolean z12, ai.p4 p4Var) {
        this.f42532n = ynVar;
        this.f42527a = z10;
        this.f42528b = z11;
        this.f42529c = w9Var;
        this.d = xnVar;
        this.f42530e = i5Var;
        this.f42531f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        yn ynVar = this.f42532n;
        ynVar.F2[1] = null;
        ynVar.f43586z2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f42532n.F2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f42529c;
            boolean z10 = this.f42528b;
            boolean z11 = this.f42527a;
            if (!z11 && !z10 && w9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.tr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f42530e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f42531f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new u4(this, 20));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
