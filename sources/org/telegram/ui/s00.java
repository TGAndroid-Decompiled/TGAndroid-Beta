package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class s00 implements Runnable {
    public final int f49589a;
    public final c40 f49590b;

    public s00(c40 c40Var, int i7) {
        this.f49589a = i7;
        this.f49590b = c40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f49589a;
        c40 c40Var = this.f49590b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    LaunchActivity launchActivity = c40Var.Z1;
                    Typeface typeface = org.telegram.messenger.g0.f22509a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(c40Var.Z1);
                        return;
                    }
                }
                if (!c40Var.u1()) {
                    LaunchActivity launchActivity2 = c40Var.Z1;
                    Typeface typeface2 = org.telegram.messenger.g0.f22509a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.p10.f36846f0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (c40Var.R2 != null && c40Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        c40Var.f44602s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(c40Var.o4, 80L);
                    c40Var.I3 = false;
                    c40Var.J3 = true;
                    return;
                }
                return;
            case 2:
                int i10 = c40Var.K3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c40Var.T1(true, false);
                    return;
                }
                return;
            case 3:
                c40Var.A1();
                return;
            case 4:
                c40Var.a1();
                c40Var.X0();
                c40Var.W0();
                c40Var.f44619w1.setTranslationY((-c40Var.f44608t3.d()) + c40Var.f28615b.getPaddingBottom());
                c40Var.f44623x1.invalidate();
                c40Var.b1();
                c40Var.f28615b.invalidate();
                return;
            case 5:
                c40Var.dismiss();
                return;
            case 6:
                c40Var.Q1();
                org.telegram.messenger.g0.i3(c40Var.f44613u3, 1000L);
                return;
            case 7:
                y20 y20Var = c40Var.f44557i2;
                if (y20Var != null) {
                    y20Var.show();
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.qp.s1(c40Var.f44565k1.f21723a).l0(null);
                return;
            default:
                c40Var.f44586o5 = null;
                c40Var.N1(true);
                return;
        }
    }
}
