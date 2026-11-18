package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class v00 implements Runnable {
    public final int f52652a;
    public final f40 f52653b;

    public v00(f40 f40Var, int i7) {
        this.f52652a = i7;
        this.f52653b = f40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f52652a;
        f40 f40Var = this.f52653b;
        switch (i7) {
            case 0:
                if (f40Var.v1()) {
                    LaunchActivity launchActivity = f40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.f24093a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.j1.j()) {
                        org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                        return;
                    }
                }
                if (!f40Var.v1()) {
                    LaunchActivity launchActivity2 = f40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.f24093a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.z10.f42711g0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f40Var.b1();
                return;
            case 2:
                if (f40Var.V2 != null && f40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        f40Var.f47536w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.S1(1, true);
                    org.telegram.messenger.g0.h3(f40Var.f47539w4, 80L);
                    f40Var.Q3 = false;
                    f40Var.R3 = true;
                    return;
                }
                return;
            case 3:
                int i10 = f40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f40Var.W1(true, false);
                    return;
                }
                return;
            case 4:
                f40Var.b1();
                f40Var.Y0();
                f40Var.X0();
                f40Var.A1.setTranslationY((-f40Var.B3.d()) + f40Var.f30192b.getPaddingBottom());
                f40Var.B1.invalidate();
                f40Var.c1();
                f40Var.f30192b.invalidate();
                return;
            case 5:
                f40Var.B1();
                return;
            case 6:
                f40Var.dismiss();
                return;
            case 7:
                f40Var.T1();
                org.telegram.messenger.g0.h3(f40Var.C3, 1000L);
                return;
            case 8:
                b30 b30Var = f40Var.f47490m2;
                if (b30Var != null) {
                    b30Var.show();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.mp.u1(f40Var.f47498o1.f23221a).l0(null);
                return;
            default:
                f40Var.f47540w5 = null;
                f40Var.O1(true);
                return;
        }
    }
}
