package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f41133a;
    public final d60 f41134b;

    public s40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f41134b = d60Var;
        this.f41133a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f41133a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f41134b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
