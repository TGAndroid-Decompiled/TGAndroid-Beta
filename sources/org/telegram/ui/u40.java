package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class u40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.v f42349a;
    public final g60 f42350b;

    public u40(g60 g60Var, org.telegram.ui.Components.voip.v vVar) {
        this.f42350b = g60Var;
        this.f42349a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.v vVar = this.f42349a;
        if (vVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42350b).containerView;
            viewGroup.removeView(vVar);
        }
    }
}
