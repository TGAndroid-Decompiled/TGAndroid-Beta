package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class t10 implements Runnable {
    public final int f41686a;
    public final b50 f41687b;

    public t10(b50 b50Var, int i10) {
        this.f41686a = i10;
        this.f41687b = b50Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41686a;
        b50 b50Var = this.f41687b;
        switch (i10) {
            case 0:
                if (b50Var.t1()) {
                    LaunchActivity launchActivity = b50Var.Z1;
                    Typeface typeface = org.telegram.messenger.i0.f15999a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.s0.f31645d0.V) {
                        b50Var.dismiss();
                        org.telegram.messenger.i0.h3(new t10(b50Var, 4), 100L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (b50Var.R2 != null && b50Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        b50Var.f36073s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    b50Var.M1(1, true);
                    org.telegram.messenger.i0.h3(b50Var.f36057o4, 80L);
                    b50Var.I3 = false;
                    b50Var.J3 = true;
                    return;
                }
                return;
            case 2:
                int i11 = b50Var.K3;
                if (i11 == 1 || i11 == 2 || i11 == 6 || i11 == 5) {
                    b50Var.Q1(true, false);
                    return;
                }
                return;
            case 3:
                b50Var.x1();
                return;
            case 4:
                org.telegram.ui.Components.voip.s0.h(b50Var.Z1);
                return;
            case 5:
                b50Var.dismiss();
                return;
            case 6:
                b50Var.N1();
                org.telegram.messenger.i0.h3(b50Var.f36085u3, 1000L);
                return;
            case 7:
                x30 x30Var = b50Var.f36027i2;
                if (x30Var != null) {
                    x30Var.show();
                    return;
                }
                return;
            case 8:
                b50Var.a1();
                b50Var.X0();
                b50Var.W0();
                b50Var.f36091w1.setTranslationY((-b50Var.f36080t3.d()) + b50Var.f21586b.getPaddingBottom());
                b50Var.f36095x1.invalidate();
                b50Var.b1();
                b50Var.f21586b.invalidate();
                return;
            case 9:
                org.telegram.messenger.vp.r1(b50Var.f36036k1.f14863a).l0(null);
                return;
            default:
                b50Var.f36058o5 = null;
                b50Var.K1(true);
                return;
        }
    }
}
