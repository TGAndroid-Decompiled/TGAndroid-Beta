package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f41561a;
    public final h60 f41562b;

    public v40(h60 h60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f41562b = h60Var;
        this.f41561a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f41561a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41562b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
