package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class z40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f42150a;
    public final n60 f42151b;

    public z40(n60 n60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f42151b = n60Var;
        this.f42150a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f42150a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42151b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
