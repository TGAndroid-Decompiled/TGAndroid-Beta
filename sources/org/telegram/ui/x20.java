package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f51497a;
    public final org.telegram.ui.Components.voip.y f51498b;
    public final f40 f51499c;

    public x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f51497a = i7;
        this.f51499c = f40Var;
        this.f51498b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51497a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f51498b;
                if (yVar.getParent() != null) {
                    this.f51499c.f28672b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f51498b;
                if (yVar2.getParent() != null) {
                    this.f51499c.f28672b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
