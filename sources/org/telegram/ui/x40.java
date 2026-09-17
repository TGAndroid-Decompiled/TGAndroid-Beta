package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f39371a;
    public final k60 f39372b;

    public x40(k60 k60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f39372b = k60Var;
        this.f39371a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f39371a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f39372b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
