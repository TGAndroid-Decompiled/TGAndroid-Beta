package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f53540a;
    public final org.telegram.ui.Components.voip.y f53541b;
    public final f40 f53542c;

    public x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f53540a = i7;
        this.f53542c = f40Var;
        this.f53541b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53540a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f53541b;
                if (yVar.getParent() != null) {
                    this.f53542c.f30190b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f53541b;
                if (yVar2.getParent() != null) {
                    this.f53542c.f30190b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
