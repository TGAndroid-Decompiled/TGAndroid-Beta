package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class vh extends AnimatorListenerAdapter {
    public final boolean f44806a;
    public final boolean f44807b;
    public final org.telegram.ui.Components.y9 f44808c;
    public final tn d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final boolean f44809f;
    public final jn h;
    public final un f44810n;

    public vh(un unVar, boolean z10, boolean z11, org.telegram.ui.Components.y9 y9Var, tn tnVar, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, jn jnVar) {
        this.f44810n = unVar;
        this.f44806a = z10;
        this.f44807b = z11;
        this.f44808c = y9Var;
        this.d = tnVar;
        this.e = b6Var;
        this.f44809f = z12;
        this.h = jnVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        un unVar = this.f44810n;
        unVar.T2[1] = null;
        unVar.N2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f44810n.T2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.y9 y9Var = this.f44808c;
            boolean z10 = this.f44807b;
            boolean z11 = this.f44806a;
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
            if (this.f44809f) {
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
