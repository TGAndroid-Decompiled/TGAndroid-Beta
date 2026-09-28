package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37180a;
    public final d60 f37181b;

    public r40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37181b = d60Var;
        this.f37180a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37180a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f37181b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
