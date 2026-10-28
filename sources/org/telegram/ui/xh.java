package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xh extends AnimatorListenerAdapter {
    public final boolean f45684a;
    public final boolean f45685b;
    public final org.telegram.ui.Components.y9 f45686c;
    public final vn d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final boolean f45687f;
    public final ln h;
    public final wn f45688n;

    public xh(wn wnVar, boolean z10, boolean z11, org.telegram.ui.Components.y9 y9Var, vn vnVar, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, ln lnVar) {
        this.f45688n = wnVar;
        this.f45684a = z10;
        this.f45685b = z11;
        this.f45686c = y9Var;
        this.d = vnVar;
        this.e = b6Var;
        this.f45687f = z12;
        this.h = lnVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        wn wnVar = this.f45688n;
        wnVar.T2[1] = null;
        wnVar.N2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f45688n.T2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.y9 y9Var = this.f45686c;
            boolean z10 = this.f45685b;
            boolean z11 = this.f45684a;
            if (!z11 && !z10 && y9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.ds.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f45687f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (y9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(y9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new kg.e(this, 25));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
