package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f43036a;
    public final i60 f43037b;

    public w40(i60 i60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f43037b = i60Var;
        this.f43036a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f43036a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f43037b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
