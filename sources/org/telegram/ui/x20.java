package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f53507a;
    public final org.telegram.ui.Components.voip.y f53508b;
    public final f40 f53509c;

    public x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f53507a = i7;
        this.f53509c = f40Var;
        this.f53508b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53507a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f53508b;
                if (yVar.getParent() != null) {
                    this.f53509c.f30142b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f53508b;
                if (yVar2.getParent() != null) {
                    this.f53509c.f30142b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
