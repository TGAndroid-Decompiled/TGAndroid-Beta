package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f38580a;
    public final j60 f38581b;

    public x40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f38581b = j60Var;
        this.f38580a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f38580a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f38581b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
