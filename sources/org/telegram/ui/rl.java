package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class rl extends AnimatorListenerAdapter {
    public final boolean f42129a;
    public final boolean f42130b;
    public final org.telegram.ui.Components.t9 f42131c;
    public final sn d;
    public final org.telegram.ui.ActionBar.h5 f42132e;
    public final boolean f42133f;
    public final eg.r h;
    public final tn f42134n;

    public rl(tn tnVar, boolean z10, boolean z11, org.telegram.ui.Components.t9 t9Var, sn snVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, eg.r rVar) {
        this.f42134n = tnVar;
        this.f42129a = z10;
        this.f42130b = z11;
        this.f42131c = t9Var;
        this.d = snVar;
        this.f42132e = h5Var;
        this.f42133f = z12;
        this.h = rVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        tn tnVar = this.f42134n;
        tnVar.D2[1] = null;
        tnVar.f43029x2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f42134n.D2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.t9 t9Var = this.f42131c;
            boolean z10 = this.f42130b;
            boolean z11 = this.f42129a;
            if (!z11 && !z10 && t9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.jr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f42132e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f42133f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (t9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(t9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new nh.q5(this, 28));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
