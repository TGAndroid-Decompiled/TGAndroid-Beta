package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f41712a;
    public final org.telegram.ui.Components.voip.r f41713b;
    public final b50 f41714c;

    public t30(b50 b50Var, org.telegram.ui.Components.voip.r rVar, int i10) {
        this.f41712a = i10;
        this.f41714c = b50Var;
        this.f41713b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41712a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.f41713b;
                if (rVar.getParent() != null) {
                    this.f41714c.f21586b.removeView(rVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.f41713b;
                if (rVar2.getParent() != null) {
                    this.f41714c.f21586b.removeView(rVar2);
                    return;
                }
                return;
        }
    }
}
