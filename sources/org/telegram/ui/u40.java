package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class u40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f38121a;
    public final g60 f38122b;

    public u40(g60 g60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f38122b = g60Var;
        this.f38121a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f38121a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f38122b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
