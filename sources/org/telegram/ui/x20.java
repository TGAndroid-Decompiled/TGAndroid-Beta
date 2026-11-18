package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f53589a;
    public final org.telegram.ui.Components.voip.y f53590b;
    public final f40 f53591c;

    public x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f53589a = i7;
        this.f53591c = f40Var;
        this.f53590b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53589a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f53590b;
                if (yVar.getParent() != null) {
                    this.f53591c.f30192b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f53590b;
                if (yVar2.getParent() != null) {
                    this.f53591c.f30192b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
