package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f38098a;
    public final e60 f38099b;

    public s40(e60 e60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f38099b = e60Var;
        this.f38098a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f38098a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f38099b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
