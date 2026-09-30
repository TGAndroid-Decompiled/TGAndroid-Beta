package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37181a;
    public final d60 f37182b;

    public r40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37182b = d60Var;
        this.f37181a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37181a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f37182b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
