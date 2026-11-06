package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f50183a;
    public final org.telegram.ui.Components.voip.y f50184b;
    public final c40 f50185c;

    public u20(c40 c40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f50183a = i7;
        this.f50185c = c40Var;
        this.f50184b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50183a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f50184b;
                if (yVar.getParent() != null) {
                    this.f50185c.f28615b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f50184b;
                if (yVar2.getParent() != null) {
                    this.f50185c.f28615b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
