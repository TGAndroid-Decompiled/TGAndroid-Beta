package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.v f43038a;
    public final i60 f43039b;

    public w40(i60 i60Var, org.telegram.ui.Components.voip.v vVar) {
        this.f43039b = i60Var;
        this.f43038a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.v vVar = this.f43038a;
        if (vVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f43039b).containerView;
            viewGroup.removeView(vVar);
        }
    }
}
