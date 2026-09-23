package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37113a;
    public final f60 f37114b;

    public s40(f60 f60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37114b = f60Var;
        this.f37113a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37113a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37114b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
