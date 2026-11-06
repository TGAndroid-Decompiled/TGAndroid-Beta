package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f50204a;
    public final org.telegram.ui.Components.voip.y f50205b;
    public final c40 f50206c;

    public u20(c40 c40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f50204a = i7;
        this.f50206c = c40Var;
        this.f50205b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50204a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f50205b;
                if (yVar.getParent() != null) {
                    this.f50206c.f28616b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f50205b;
                if (yVar2.getParent() != null) {
                    this.f50206c.f28616b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
