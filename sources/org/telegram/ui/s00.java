package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class s00 implements Runnable {
    public final int f51058a;
    public final c40 f51059b;

    public s00(c40 c40Var, int i7) {
        this.f51058a = i7;
        this.f51059b = c40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51058a;
        c40 c40Var = this.f51059b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    LaunchActivity launchActivity = c40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.f23583a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.k1.i()) {
                        org.telegram.ui.Components.voip.k1.k(c40Var.d2);
                        return;
                    }
                }
                if (!c40Var.u1()) {
                    LaunchActivity launchActivity2 = c40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.f23583a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.s10.f39140g0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c40Var.a1();
                return;
            case 2:
                if (c40Var.V2 != null && c40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        c40Var.f45978w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.R1(1, true);
                    org.telegram.messenger.g0.i3(c40Var.f45981w4, 80L);
                    c40Var.Q3 = false;
                    c40Var.R3 = true;
                    return;
                }
                return;
            case 3:
                int i10 = c40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c40Var.V1(true, false);
                    return;
                }
                return;
            case 4:
                c40Var.a1();
                c40Var.X0();
                c40Var.W0();
                c40Var.A1.setTranslationY((-c40Var.B3.d()) + c40Var.f29682b.getPaddingBottom());
                c40Var.B1.invalidate();
                c40Var.b1();
                c40Var.f29682b.invalidate();
                return;
            case 5:
                c40Var.A1();
                return;
            case 6:
                c40Var.dismiss();
                return;
            case 7:
                c40Var.S1();
                org.telegram.messenger.g0.i3(c40Var.C3, 1000L);
                return;
            case 8:
                y20 y20Var = c40Var.f45932m2;
                if (y20Var != null) {
                    y20Var.show();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.np.s1(c40Var.f45940o1.f22782a).l0(null);
                return;
            default:
                c40Var.f45982w5 = null;
                c40Var.N1(true);
                return;
        }
    }
}
