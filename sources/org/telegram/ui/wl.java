package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class wl extends AnimatorListenerAdapter {
    public final boolean f39485a;
    public final boolean f39486b;
    public final org.telegram.ui.Components.w9 f39487c;
    public final vn d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final boolean f39488f;
    public final ai.p4 h;
    public final wn f39489n;

    public wl(wn wnVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, vn vnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, ai.p4 p4Var) {
        this.f39489n = wnVar;
        this.f39485a = z10;
        this.f39486b = z11;
        this.f39487c = w9Var;
        this.d = vnVar;
        this.e = h5Var;
        this.f39488f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        wn wnVar = this.f39489n;
        wnVar.H2[1] = null;
        wnVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f39489n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f39487c;
            boolean z10 = this.f39486b;
            boolean z11 = this.f39485a;
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
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f39488f) {
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
