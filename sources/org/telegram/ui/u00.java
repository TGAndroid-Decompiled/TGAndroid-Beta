package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class u00 implements Runnable {
    public final int f52505a;
    public final e40 f52506b;

    public u00(e40 e40Var, int i7) {
        this.f52505a = i7;
        this.f52506b = e40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f52505a;
        e40 e40Var = this.f52506b;
        switch (i7) {
            case 0:
                if (e40Var.v1()) {
                    LaunchActivity launchActivity = e40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.f24198a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.k1.e()) {
                        org.telegram.ui.Components.voip.k1.g(e40Var.d2);
                        return;
                    }
                }
                if (!e40Var.v1()) {
                    LaunchActivity launchActivity2 = e40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.f24198a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.a20.f33324g0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e40Var.b1();
                return;
            case 2:
                if (e40Var.V2 != null && e40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        e40Var.f47414w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.R1(1, true);
                    org.telegram.messenger.g0.h3(e40Var.f47417w4, 80L);
                    e40Var.Q3 = false;
                    e40Var.R3 = true;
                    return;
                }
                return;
            case 3:
                int i10 = e40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e40Var.V1(true, false);
                    return;
                }
                return;
            case 4:
                e40Var.b1();
                e40Var.Y0();
                e40Var.X0();
                e40Var.A1.setTranslationY((-e40Var.B3.d()) + e40Var.f30226b.getPaddingBottom());
                e40Var.B1.invalidate();
                e40Var.c1();
                e40Var.f30226b.invalidate();
                return;
            case 5:
                e40Var.B1();
                return;
            case 6:
                e40Var.dismiss();
                return;
            case 7:
                e40Var.S1();
                org.telegram.messenger.g0.h3(e40Var.C3, 1000L);
                return;
            case 8:
                a30 a30Var = e40Var.f47368m2;
                if (a30Var != null) {
                    a30Var.show();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.mp.u1(e40Var.f47376o1.f23343a).l0(null);
                return;
            default:
                e40Var.f47418w5 = null;
                e40Var.O1(true);
                return;
        }
    }
}
