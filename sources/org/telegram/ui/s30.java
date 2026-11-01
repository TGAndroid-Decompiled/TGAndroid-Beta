package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s30 extends AnimatorListenerAdapter {
    public final int f41211a;
    public final org.telegram.ui.Components.voip.r f41212b;
    public final a50 f41213c;

    public s30(a50 a50Var, org.telegram.ui.Components.voip.r rVar, int i10) {
        this.f41211a = i10;
        this.f41213c = a50Var;
        this.f41212b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41211a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.f41212b;
                if (rVar.getParent() != null) {
                    this.f41213c.f21587b.removeView(rVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.f41212b;
                if (rVar2.getParent() != null) {
                    this.f41213c.f21587b.removeView(rVar2);
                    return;
                }
                return;
        }
    }
}
