package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class s10 implements Runnable {
    public final int f41195a;
    public final a50 f41196b;

    public s10(a50 a50Var, int i10) {
        this.f41195a = i10;
        this.f41196b = a50Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41195a;
        a50 a50Var = this.f41196b;
        switch (i10) {
            case 0:
                if (a50Var.t1()) {
                    LaunchActivity launchActivity = a50Var.Z1;
                    Typeface typeface = org.telegram.messenger.i0.f16145a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.t0.f31724d0.V) {
                        a50Var.dismiss();
                        org.telegram.messenger.i0.h3(new s10(a50Var, 4), 100L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (a50Var.R2 != null && a50Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        a50Var.f35657s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    a50Var.M1(1, true);
                    org.telegram.messenger.i0.h3(a50Var.f35641o4, 80L);
                    a50Var.I3 = false;
                    a50Var.J3 = true;
                    return;
                }
                return;
            case 2:
                int i11 = a50Var.K3;
                if (i11 == 1 || i11 == 2 || i11 == 6 || i11 == 5) {
                    a50Var.Q1(true, false);
                    return;
                }
                return;
            case 3:
                a50Var.x1();
                return;
            case 4:
                org.telegram.ui.Components.voip.t0.h(a50Var.Z1);
                return;
            case 5:
                a50Var.dismiss();
                return;
            case 6:
                a50Var.N1();
                org.telegram.messenger.i0.h3(a50Var.f35669u3, 1000L);
                return;
            case 7:
                w30 w30Var = a50Var.f35611i2;
                if (w30Var != null) {
                    w30Var.show();
                    return;
                }
                return;
            case 8:
                a50Var.a1();
                a50Var.X0();
                a50Var.W0();
                a50Var.f35675w1.setTranslationY((-a50Var.f35664t3.d()) + a50Var.f21587b.getPaddingBottom());
                a50Var.f35679x1.invalidate();
                a50Var.b1();
                a50Var.f21587b.invalidate();
                return;
            case 9:
                org.telegram.messenger.wp.r1(a50Var.f35620k1.f15043a).l0(null);
                return;
            default:
                a50Var.f35642o5 = null;
                a50Var.K1(true);
                return;
        }
    }
}
