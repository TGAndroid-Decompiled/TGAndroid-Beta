package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class ya1 extends AnimatorListenerAdapter {
    public final int f43625a;
    public final boolean f43626b;
    public final nb1 f43627c;

    public ya1(nb1 nb1Var, boolean z10, int i10) {
        this.f43625a = i10;
        this.f43627c = nb1Var;
        this.f43626b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f43625a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f43626b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                nb1 nb1Var = this.f43627c;
                nb1Var.W0(f7);
                if (z10) {
                    nb1Var.f39832q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = nb1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).classGuid;
                org.telegram.messenger.i0.k3(parentActivity, i10);
                nb1Var.f39834r0.setVisibility(8);
                nb1Var.U0(true);
                return;
            default:
                if (!this.f43626b) {
                    this.f43627c.f39828o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
