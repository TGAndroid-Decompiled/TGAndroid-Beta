package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ri1 extends AnimatorListenerAdapter {
    public final int f39810a;
    public final dj1 f39811b;

    public ri1(dj1 dj1Var, int i10) {
        this.f39810a = i10;
        this.f39811b = dj1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.z9[] z9VarArr;
        bi.b4 b4Var;
        org.telegram.ui.Components.z9[] z9VarArr2;
        bi.b4 b4Var2;
        switch (this.f39810a) {
            case 0:
                dj1 dj1Var = this.f39811b;
                dj1Var.f35295i1 = null;
                dj1Var.f35289f1 = 1.0f;
                dj1Var.Y0 = 0.0f;
                dj1Var.Z0 = 0.0f;
                dj1Var.f35309s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f30265a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new uz0(this, 24), 200L);
                return;
            case 2:
                dj1 dj1Var2 = this.f39811b;
                dj1Var2.L0.unlock();
                dj1Var2.Y.setCornerRadius(-1.0f);
                dj1Var2.E0 = false;
                dj1Var2.Y.f30452b0 = false;
                dj1Var2.f35306q0 = dj1Var2.f35305p0;
                dj1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.z9 z9Var : this.f39811b.V) {
                    org.telegram.ui.Components.s5 s5Var = z9Var.e;
                    if (s5Var != null && (b4Var = s5Var.f29031k) != null) {
                        b4Var.setAllowStartAnimation(true);
                        z9Var.e.f29031k.startAnimation();
                    }
                }
                return;
            case 4:
                dj1 dj1Var3 = this.f39811b;
                dj1Var3.A();
                for (org.telegram.ui.Components.z9 z9Var2 : dj1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = z9Var2.e;
                    if (s5Var2 != null && (b4Var2 = s5Var2.f29031k) != null) {
                        b4Var2.setAllowStartAnimation(false);
                        z9Var2.e.f29031k.stopAnimation();
                    }
                }
                dj1Var3.R.setVisibility(8);
                return;
            case 5:
                dj1 dj1Var4 = this.f39811b;
                if (dj1Var4.Z.getTag() == null) {
                    dj1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                dj1 dj1Var5 = this.f39811b;
                dj1Var5.Y.setTranslationX(0.0f);
                dj1Var5.Y.setTranslationY(0.0f);
                dj1Var5.Y.setScaleY(1.0f);
                dj1Var5.Y.setScaleX(1.0f);
                dj1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39811b.f35318y.setVisibility(8);
                return;
            default:
                this.f39811b.f35285e0.setVisibility(8);
                return;
        }
    }
}
