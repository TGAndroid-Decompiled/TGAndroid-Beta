package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f38343a;
    public final i60 f38344b;

    public v40(i60 i60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f38344b = i60Var;
        this.f38343a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f38343a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f38344b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
