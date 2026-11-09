package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class u00 implements Runnable {
    public final int f50273a;
    public final e40 f50274b;

    public u00(e40 e40Var, int i7) {
        this.f50273a = i7;
        this.f50274b = e40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50273a;
        e40 e40Var = this.f50274b;
        switch (i7) {
            case 0:
                if (e40Var.u1()) {
                    LaunchActivity launchActivity = e40Var.Z1;
                    Typeface typeface = org.telegram.messenger.g0.f22535a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(e40Var.Z1);
                        return;
                    }
                }
                if (!e40Var.u1()) {
                    LaunchActivity launchActivity2 = e40Var.Z1;
                    Typeface typeface2 = org.telegram.messenger.g0.f22535a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.q10.f37163f0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (e40Var.R2 != null && e40Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        e40Var.f45265s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(e40Var.o4, 80L);
                    e40Var.I3 = false;
                    e40Var.J3 = true;
                    return;
                }
                return;
            case 2:
                int i10 = e40Var.K3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e40Var.T1(true, false);
                    return;
                }
                return;
            case 3:
                e40Var.A1();
                return;
            case 4:
                e40Var.a1();
                e40Var.X0();
                e40Var.W0();
                e40Var.f45282w1.setTranslationY((-e40Var.f45271t3.d()) + e40Var.f28624b.getPaddingBottom());
                e40Var.f45286x1.invalidate();
                e40Var.b1();
                e40Var.f28624b.invalidate();
                return;
            case 5:
                e40Var.dismiss();
                return;
            case 6:
                e40Var.Q1();
                org.telegram.messenger.g0.i3(e40Var.f45276u3, 1000L);
                return;
            case 7:
                a30 a30Var = e40Var.f45220i2;
                if (a30Var != null) {
                    a30Var.show();
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.qp.s1(e40Var.f45228k1.f21765a).l0(null);
                return;
            default:
                e40Var.f45249o5 = null;
                e40Var.N1(true);
                return;
        }
    }
}
