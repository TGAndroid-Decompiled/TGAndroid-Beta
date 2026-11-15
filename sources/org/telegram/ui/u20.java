package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f51722a;
    public final org.telegram.ui.Components.voip.z f51723b;
    public final c40 f51724c;

    public u20(c40 c40Var, org.telegram.ui.Components.voip.z zVar, int i7) {
        this.f51722a = i7;
        this.f51724c = c40Var;
        this.f51723b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51722a) {
            case 0:
                org.telegram.ui.Components.voip.z zVar = this.f51723b;
                if (zVar.getParent() != null) {
                    this.f51724c.f29682b.removeView(zVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.z zVar2 = this.f51723b;
                if (zVar2.getParent() != null) {
                    this.f51724c.f29682b.removeView(zVar2);
                    return;
                }
                return;
        }
    }
}
