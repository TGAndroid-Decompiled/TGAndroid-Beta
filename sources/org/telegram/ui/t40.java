package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37643a;
    public final g60 f37644b;

    public t40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37644b = g60Var;
        this.f37643a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37643a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f37644b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
