package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f43722a;
    public final ad1 f43723b;

    public zc1(ad1 ad1Var, int i10) {
        this.f43722a = i10;
        this.f43723b = ad1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43722a) {
            case 0:
                this.f43723b.f35343s.f37290s.setVisibility(8);
                return;
            default:
                this.f43723b.f35343s.f37284a.setVisibility(8);
                return;
        }
    }
}
