package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f53586a;
    public final org.telegram.ui.Components.voip.y f53587b;
    public final f40 f53588c;

    public x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f53586a = i7;
        this.f53588c = f40Var;
        this.f53587b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53586a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f53587b;
                if (yVar.getParent() != null) {
                    this.f53588c.f30176b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f53587b;
                if (yVar2.getParent() != null) {
                    this.f53588c.f30176b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
