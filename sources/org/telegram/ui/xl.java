package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f43076a;
    public final boolean f43077b;
    public final org.telegram.ui.Components.p9 f43078c;
    public final wn d;
    public final org.telegram.ui.ActionBar.l5 f43079e;
    public final boolean f43080f;
    public final hg.q h;
    public final xn f43081n;

    public xl(xn xnVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, wn wnVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, hg.q qVar) {
        this.f43081n = xnVar;
        this.f43076a = z4;
        this.f43077b = z10;
        this.f43078c = p9Var;
        this.d = wnVar;
        this.f43079e = l5Var;
        this.f43080f = z11;
        this.h = qVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        xn xnVar = this.f43081n;
        xnVar.E2[1] = null;
        xnVar.f43397y2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f43081n.E2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.f43078c;
            boolean z4 = this.f43077b;
            boolean z10 = this.f43076a;
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
                arrayList.add(ObjectAnimator.ofFloat(this.f43079e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f43080f) {
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
