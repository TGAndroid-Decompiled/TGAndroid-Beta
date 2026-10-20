package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vg1 extends AnimatorListenerAdapter {
    public final int f42255a;
    public final hh1 f42256b;

    public vg1(hh1 hh1Var, int i10) {
        this.f42255a = i10;
        this.f42256b = hh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ci.g3 g3Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ci.g3 g3Var2;
        switch (this.f42255a) {
            case 0:
                hh1 hh1Var = this.f42256b;
                hh1Var.f37651i1 = null;
                hh1Var.f37645f1 = 1.0f;
                hh1Var.Y0 = 0.0f;
                hh1Var.Z0 = 0.0f;
                hh1Var.f37665s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f31496a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new qy0(this, 24), 200L);
                return;
            case 2:
                hh1 hh1Var2 = this.f42256b;
                hh1Var2.L0.unlock();
                hh1Var2.Y.setCornerRadius(-1.0f);
                hh1Var2.E0 = false;
                hh1Var2.Y.f31688b0 = false;
                hh1Var2.f37662q0 = hh1Var2.f37661p0;
                hh1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f42256b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (g3Var = r5Var.f29837k) != null) {
                        g3Var.setAllowStartAnimation(true);
                        w9Var.e.f29837k.startAnimation();
                    }
                }
                return;
            case 4:
                hh1 hh1Var3 = this.f42256b;
                hh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : hh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (g3Var2 = r5Var2.f29837k) != null) {
                        g3Var2.setAllowStartAnimation(false);
                        w9Var2.e.f29837k.stopAnimation();
                    }
                }
                hh1Var3.R.setVisibility(8);
                return;
            case 5:
                hh1 hh1Var4 = this.f42256b;
                if (hh1Var4.Z.getTag() == null) {
                    hh1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                hh1 hh1Var5 = this.f42256b;
                hh1Var5.Y.setTranslationX(0.0f);
                hh1Var5.Y.setTranslationY(0.0f);
                hh1Var5.Y.setScaleY(1.0f);
                hh1Var5.Y.setScaleX(1.0f);
                hh1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f42256b.f37674y.setVisibility(8);
                return;
            default:
                this.f42256b.f37641e0.setVisibility(8);
                return;
        }
    }
}
