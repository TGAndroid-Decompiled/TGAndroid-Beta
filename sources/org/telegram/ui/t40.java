package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37521a;
    public final f60 f37522b;

    public t40(f60 f60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37522b = f60Var;
        this.f37521a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37521a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37522b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
