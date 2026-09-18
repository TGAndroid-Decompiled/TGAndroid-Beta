package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f38694a;
    public final i60 f38695b;

    public w40(i60 i60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f38695b = i60Var;
        this.f38694a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f38694a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f38695b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
