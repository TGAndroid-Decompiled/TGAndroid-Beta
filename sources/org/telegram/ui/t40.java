package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.v f42061a;
    public final g60 f42062b;

    public t40(g60 g60Var, org.telegram.ui.Components.voip.v vVar) {
        this.f42062b = g60Var;
        this.f42061a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.v vVar = this.f42061a;
        if (vVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42062b).containerView;
            viewGroup.removeView(vVar);
        }
    }
}
