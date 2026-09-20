package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f39612a;
    public final boolean f39613b;
    public final org.telegram.ui.Components.v9 f39614c;
    public final yn d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final boolean f39615f;
    public final ai.p4 h;
    public final zn f39616n;

    public xl(zn znVar, boolean z10, boolean z11, org.telegram.ui.Components.v9 v9Var, yn ynVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, ai.p4 p4Var) {
        this.f39616n = znVar;
        this.f39612a = z10;
        this.f39613b = z11;
        this.f39614c = v9Var;
        this.d = ynVar;
        this.e = j5Var;
        this.f39615f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.f39616n;
        znVar.H2[1] = null;
        znVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f39616n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.v9 v9Var = this.f39614c;
            boolean z10 = this.f39613b;
            boolean z11 = this.f39612a;
            if (!z11 && !z10 && v9Var == null) {
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
            if (this.f39615f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (v9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(v9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new t4(this, 20));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
