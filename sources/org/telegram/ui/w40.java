package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class w40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37699a;
    public final j60 f37700b;

    public w40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37700b = j60Var;
        this.f37699a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37699a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f37700b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
