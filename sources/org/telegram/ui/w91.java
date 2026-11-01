package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w91 extends AnimatorListenerAdapter {
    public final int f42735a;
    public final x91 f42736b;

    public w91(x91 x91Var, int i10) {
        this.f42735a = i10;
        this.f42736b = x91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42735a) {
            case 0:
                this.f42736b.f43292b.f36276s.setVisibility(8);
                return;
            default:
                this.f42736b.f43292b.f36270a.setVisibility(8);
                return;
        }
    }
}
