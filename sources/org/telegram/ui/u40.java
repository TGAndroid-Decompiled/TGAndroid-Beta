package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class u40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f42371a;
    public final g60 f42372b;

    public u40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f42372b = g60Var;
        this.f42371a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f42371a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f42372b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
