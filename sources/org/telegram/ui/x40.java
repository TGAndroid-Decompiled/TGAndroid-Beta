package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f39376a;
    public final k60 f39377b;

    public x40(k60 k60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f39377b = k60Var;
        this.f39376a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f39376a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f39377b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
