package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class vh extends AnimatorListenerAdapter {
    public final boolean f42224a;
    public final boolean f42225b;
    public final org.telegram.ui.Components.w9 f42226c;
    public final rn d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final boolean f42227f;
    public final ai.vd h;
    public final sn f42228n;

    public vh(sn snVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, rn rnVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, ai.vd vdVar) {
        this.f42228n = snVar;
        this.f42224a = z10;
        this.f42225b = z11;
        this.f42226c = w9Var;
        this.d = rnVar;
        this.e = j5Var;
        this.f42227f = z12;
        this.h = vdVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        sn snVar = this.f42228n;
        snVar.H2[1] = null;
        snVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f42228n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f42226c;
            boolean z10 = this.f42225b;
            boolean z11 = this.f42224a;
            if (!z11 && !z10 && w9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.bs.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f42227f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new m.a(this, 23));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
