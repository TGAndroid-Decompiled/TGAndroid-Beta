package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f41409a;
    public final j60 f41410b;

    public v40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f41410b = j60Var;
        this.f41409a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f41409a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41410b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
