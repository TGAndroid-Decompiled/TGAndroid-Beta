package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f50196a;
    public final org.telegram.ui.Components.voip.y f50197b;
    public final c40 f50198c;

    public u20(c40 c40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f50196a = i7;
        this.f50198c = c40Var;
        this.f50197b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50196a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f50197b;
                if (yVar.getParent() != null) {
                    this.f50198c.f28619b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f50197b;
                if (yVar2.getParent() != null) {
                    this.f50198c.f28619b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
