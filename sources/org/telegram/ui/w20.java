package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f53087a;
    public final org.telegram.ui.Components.voip.z f53088b;
    public final e40 f53089c;

    public w20(e40 e40Var, org.telegram.ui.Components.voip.z zVar, int i7) {
        this.f53087a = i7;
        this.f53089c = e40Var;
        this.f53088b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53087a) {
            case 0:
                org.telegram.ui.Components.voip.z zVar = this.f53088b;
                if (zVar.getParent() != null) {
                    this.f53089c.f30226b.removeView(zVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.z zVar2 = this.f53088b;
                if (zVar2.getParent() != null) {
                    this.f53089c.f30226b.removeView(zVar2);
                    return;
                }
                return;
        }
    }
}
