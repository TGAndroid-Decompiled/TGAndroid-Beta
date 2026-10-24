package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class th extends AnimatorListenerAdapter {
    public final boolean f42056a;
    public final boolean f42057b;
    public final org.telegram.ui.Components.u9 f42058c;
    public final rn d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final boolean f42059f;
    public final hn h;
    public final sn f42060n;

    public th(sn snVar, boolean z10, boolean z11, org.telegram.ui.Components.u9 u9Var, rn rnVar, org.telegram.ui.ActionBar.n5 n5Var, boolean z12, hn hnVar) {
        this.f42060n = snVar;
        this.f42056a = z10;
        this.f42057b = z11;
        this.f42058c = u9Var;
        this.d = rnVar;
        this.e = n5Var;
        this.f42059f = z12;
        this.h = hnVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        sn snVar = this.f42060n;
        snVar.T2[1] = null;
        snVar.N2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f42060n.T2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.u9 u9Var = this.f42058c;
            boolean z10 = this.f42057b;
            boolean z11 = this.f42056a;
            if (!z11 && !z10 && u9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.zr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f42059f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (u9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(u9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new m.a(this, 23));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
