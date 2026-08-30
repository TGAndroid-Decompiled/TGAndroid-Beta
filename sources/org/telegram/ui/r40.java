package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37916a;
    public final c60 f37917b;

    public r40(c60 c60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37917b = c60Var;
        this.f37916a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37916a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f37917b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
