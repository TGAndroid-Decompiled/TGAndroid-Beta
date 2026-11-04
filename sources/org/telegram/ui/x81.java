package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class x81 extends AnimatorListenerAdapter {
    public final int f51889a;
    public final boolean f51890b;
    public final m91 f51891c;

    public x81(m91 m91Var, boolean z10, int i3) {
        this.f51889a = i3;
        this.f51891c = m91Var;
        this.f51890b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i3;
        switch (this.f51889a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f51890b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                m91 m91Var = this.f51891c;
                m91Var.W0(f10);
                if (z10) {
                    m91Var.f47613r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = m91Var.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) m91Var).classGuid;
                org.telegram.messenger.g0.l3(parentActivity, i3);
                m91Var.f47615s0.setVisibility(8);
                m91Var.U0(true);
                return;
            default:
                if (!this.f51890b) {
                    this.f51891c.f47608p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
