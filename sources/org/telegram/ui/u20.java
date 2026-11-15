package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f51723a;
    public final org.telegram.ui.Components.voip.z f51724b;
    public final c40 f51725c;

    public u20(c40 c40Var, org.telegram.ui.Components.voip.z zVar, int i7) {
        this.f51723a = i7;
        this.f51725c = c40Var;
        this.f51724b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51723a) {
            case 0:
                org.telegram.ui.Components.voip.z zVar = this.f51724b;
                if (zVar.getParent() != null) {
                    this.f51725c.f29682b.removeView(zVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.z zVar2 = this.f51724b;
                if (zVar2.getParent() != null) {
                    this.f51725c.f29682b.removeView(zVar2);
                    return;
                }
                return;
        }
    }
}
