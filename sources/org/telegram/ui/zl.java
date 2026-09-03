package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class zl extends AnimatorListenerAdapter {
    public final boolean f40497a;
    public final boolean f40498b;
    public final org.telegram.ui.Components.p9 f40499c;
    public final yn d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final boolean f40500f;
    public final gg.q h;
    public final zn f40501n;

    public zl(zn znVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, yn ynVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, gg.q qVar) {
        this.f40501n = znVar;
        this.f40497a = z4;
        this.f40498b = z10;
        this.f40499c = p9Var;
        this.d = ynVar;
        this.e = k5Var;
        this.f40500f = z11;
        this.h = qVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.f40501n;
        znVar.E2[1] = null;
        znVar.f40816y2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f40501n.E2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.f40499c;
            boolean z4 = this.f40498b;
            boolean z10 = this.f40497a;
            if (!z10 && !z4 && p9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.mr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f40500f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new u5(this, 19));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
