package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f41838a;
    public final g60 f41839b;

    public t40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f41839b = g60Var;
        this.f41838a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f41838a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41839b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
