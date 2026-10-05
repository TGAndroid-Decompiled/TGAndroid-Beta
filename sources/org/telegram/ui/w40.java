package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f41912a;
    public final h60 f41913b;

    public w40(h60 h60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f41913b = h60Var;
        this.f41912a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f41912a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41913b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
