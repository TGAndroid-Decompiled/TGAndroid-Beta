package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wh1 extends AnimatorListenerAdapter {
    public final int f39705a;
    public final ii1 f39706b;

    public wh1(ii1 ii1Var, int i10) {
        this.f39705a = i10;
        this.f39706b = ii1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.p9[] p9VarArr;
        nh.y2 y2Var;
        org.telegram.ui.Components.p9[] p9VarArr2;
        nh.y2 y2Var2;
        switch (this.f39705a) {
            case 0:
                ii1 ii1Var = this.f39706b;
                ii1Var.f34959f1 = null;
                ii1Var.f34952c1 = 1.0f;
                ii1Var.V0 = 0.0f;
                ii1Var.W0 = 0.0f;
                ii1Var.f34977s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29744a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new sz0(this, 23), 200L);
                return;
            case 2:
                ii1 ii1Var2 = this.f39706b;
                ii1Var2.I0.unlock();
                ii1Var2.V.setCornerRadius(-1.0f);
                ii1Var2.B0 = false;
                ii1Var2.V.V = false;
                ii1Var2.f34971n0 = ii1Var2.m0;
                ii1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.f39706b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.e;
                    if (l5Var != null && (y2Var = l5Var.f26587k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        p9Var.e.f26587k.startAnimation();
                    }
                }
                return;
            case 4:
                ii1 ii1Var3 = this.f39706b;
                ii1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ii1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.e;
                    if (l5Var2 != null && (y2Var2 = l5Var2.f26587k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        p9Var2.e.f26587k.stopAnimation();
                    }
                }
                ii1Var3.O.setVisibility(8);
                return;
            case 5:
                ii1 ii1Var4 = this.f39706b;
                if (ii1Var4.W.getTag() == null) {
                    ii1Var4.W.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ii1 ii1Var5 = this.f39706b;
                ii1Var5.V.setTranslationX(0.0f);
                ii1Var5.V.setTranslationY(0.0f);
                ii1Var5.V.setScaleY(1.0f);
                ii1Var5.V.setScaleX(1.0f);
                ii1Var5.V.setVisibility(8);
                return;
            case 7:
                this.f39706b.f34986y.setVisibility(8);
                return;
            default:
                this.f39706b.f34948b0.setVisibility(8);
                return;
        }
    }
}
