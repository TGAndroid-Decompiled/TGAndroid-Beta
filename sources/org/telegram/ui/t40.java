package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f41840a;
    public final g60 f41841b;

    public t40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f41841b = g60Var;
        this.f41840a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f41840a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41841b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
