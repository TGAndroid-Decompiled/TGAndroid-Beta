package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f38381a;
    public final e60 f38382b;

    public t40(e60 e60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f38382b = e60Var;
        this.f38381a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f38381a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f38382b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
