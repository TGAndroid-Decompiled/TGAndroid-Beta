package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class u40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f42325a;
    public final g60 f42326b;

    public u40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f42326b = g60Var;
        this.f42325a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f42325a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f42326b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
