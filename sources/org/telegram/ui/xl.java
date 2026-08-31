package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f43098a;
    public final boolean f43099b;
    public final org.telegram.ui.Components.p9 f43100c;
    public final wn d;
    public final org.telegram.ui.ActionBar.l5 f43101e;
    public final boolean f43102f;
    public final hg.q h;
    public final xn f43103n;

    public xl(xn xnVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, wn wnVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, hg.q qVar) {
        this.f43103n = xnVar;
        this.f43098a = z4;
        this.f43099b = z10;
        this.f43100c = p9Var;
        this.d = wnVar;
        this.f43101e = l5Var;
        this.f43102f = z11;
        this.h = qVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        xn xnVar = this.f43103n;
        xnVar.E2[1] = null;
        xnVar.f43419y2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f43103n.E2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.f43100c;
            boolean z4 = this.f43099b;
            boolean z10 = this.f43098a;
            if (!z10 && !z4 && p9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.pr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this.f43101e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f43102f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new s5(this, 19));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
