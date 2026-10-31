package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class u81 extends AnimatorListenerAdapter {
    public final boolean f42074a;
    public final int f42075b;
    public final int f42076c;
    public final boolean d;
    public final m91 e;

    public u81(m91 m91Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = m91Var;
        this.f42074a = z10;
        this.f42075b = i10;
        this.f42076c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m91 m91Var = this.e;
        FrameLayout[] frameLayoutArr = m91Var.M0;
        m91Var.f39589s1 = null;
        int i10 = this.f42076c;
        int i11 = this.f42075b;
        boolean z10 = this.f42074a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = m91Var.f39540b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.x71[] x71VarArr = m91Var.K0;
        if (this.d) {
            c10 = 0;
        }
        x71VarArr[c10].setVisibility(4);
    }
}
