package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f40763a;
    public final d60 f40764b;

    public r40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f40764b = d60Var;
        this.f40763a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f40763a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f40764b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
