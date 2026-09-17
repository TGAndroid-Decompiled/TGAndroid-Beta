package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class y40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f39786a;
    public final k60 f39787b;

    public y40(k60 k60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f39787b = k60Var;
        this.f39786a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f39786a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f39787b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
