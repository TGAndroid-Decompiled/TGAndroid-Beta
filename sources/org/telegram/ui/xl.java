package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f39507a;
    public final boolean f39508b;
    public final org.telegram.ui.Components.w9 f39509c;
    public final yn d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final boolean f39510f;
    public final ai.p4 h;
    public final zn f39511n;

    public xl(zn znVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, yn ynVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, ai.p4 p4Var) {
        this.f39511n = znVar;
        this.f39507a = z10;
        this.f39508b = z11;
        this.f39509c = w9Var;
        this.d = ynVar;
        this.e = j5Var;
        this.f39510f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.f39511n;
        znVar.H2[1] = null;
        znVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f39511n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f39509c;
            boolean z10 = this.f39508b;
            boolean z11 = this.f39507a;
            if (!z11 && !z10 && w9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.qr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f39510f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new t4(this, 20));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
