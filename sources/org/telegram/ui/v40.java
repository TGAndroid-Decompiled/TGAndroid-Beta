package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f42668a;
    public final i60 f42669b;

    public v40(i60 i60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f42669b = i60Var;
        this.f42668a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f42668a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42669b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
