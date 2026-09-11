package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f41408a;
    public final j60 f41409b;

    public v40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f41409b = j60Var;
        this.f41408a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f41408a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41409b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
