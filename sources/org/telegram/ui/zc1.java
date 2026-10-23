package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f43727a;
    public final ad1 f43728b;

    public zc1(ad1 ad1Var, int i10) {
        this.f43727a = i10;
        this.f43728b = ad1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43727a) {
            case 0:
                this.f43728b.f35356s.f37295s.setVisibility(8);
                return;
            default:
                this.f43728b.f35356s.f37289a.setVisibility(8);
                return;
        }
    }
}
