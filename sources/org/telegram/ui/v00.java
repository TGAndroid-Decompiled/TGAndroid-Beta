package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class v00 implements Runnable {
    public final int f50603a;
    public final f40 f50604b;

    public v00(f40 f40Var, int i7) {
        this.f50603a = i7;
        this.f50604b = f40Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50603a;
        f40 f40Var = this.f50604b;
        switch (i7) {
            case 0:
                if (f40Var.u1()) {
                    LaunchActivity launchActivity = f40Var.f45512c2;
                    Typeface typeface = org.telegram.messenger.g0.f22539a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(f40Var.f45512c2);
                        return;
                    }
                }
                if (!f40Var.u1()) {
                    LaunchActivity launchActivity2 = f40Var.f45512c2;
                    Typeface typeface2 = org.telegram.messenger.g0.f22539a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.p10.f36762f0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (f40Var.U2 != null && f40Var.L3 && VoIPService.getSharedInstance() != null) {
                    try {
                        f40Var.f45592v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(f40Var.f45576r4, 80L);
                    f40Var.L3 = false;
                    f40Var.M3 = true;
                    return;
                }
                return;
            case 2:
                int i10 = f40Var.N3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f40Var.T1(true, false);
                    return;
                }
                return;
            case 3:
                f40Var.A1();
                return;
            case 4:
                f40Var.a1();
                f40Var.X0();
                f40Var.W0();
                f40Var.f45610z1.setTranslationY((-f40Var.f45599w3.d()) + f40Var.f28672b.getPaddingBottom());
                f40Var.A1.invalidate();
                f40Var.b1();
                f40Var.f28672b.invalidate();
                return;
            case 5:
                f40Var.dismiss();
                return;
            case 6:
                f40Var.Q1();
                org.telegram.messenger.g0.i3(f40Var.f45604x3, 1000L);
                return;
            case 7:
                b30 b30Var = f40Var.f45546l2;
                if (b30Var != null) {
                    b30Var.show();
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.qp.s1(f40Var.n1.f21770a).l0(null);
                return;
            default:
                f40Var.f45577r5 = null;
                f40Var.N1(true);
                return;
        }
    }
}
