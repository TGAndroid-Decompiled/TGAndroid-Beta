package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f41784a;
    public final j60 f41785b;

    public w40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f41785b = j60Var;
        this.f41784a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f41784a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41785b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
