package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f40750a;
    public final d60 f40751b;

    public r40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f40751b = d60Var;
        this.f40750a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f40750a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f40751b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
