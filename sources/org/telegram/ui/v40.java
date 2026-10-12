package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.v f42670a;
    public final i60 f42671b;

    public v40(i60 i60Var, org.telegram.ui.Components.voip.v vVar) {
        this.f42671b = i60Var;
        this.f42670a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.v vVar = this.f42670a;
        if (vVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42671b).containerView;
            viewGroup.removeView(vVar);
        }
    }
}
