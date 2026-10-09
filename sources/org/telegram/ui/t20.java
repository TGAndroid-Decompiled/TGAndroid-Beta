package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class t20 implements Runnable {
    public final int f41829a;
    public final g60 f41830b;

    public t20(g60 g60Var, int i10) {
        this.f41829a = i10;
        this.f41830b = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f41829a) {
            case 0:
                g60 g60Var = this.f41830b;
                if (g60Var.s1() && AndroidUtilities.checkInlinePermissions(g60Var.f37823i0) && !org.telegram.ui.Components.voip.j1.f31997d0.V) {
                    g60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new t20(g60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                g60 g60Var2 = this.f41830b;
                if (g60Var2.f37789a1 != null && g60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        g60Var2.f37879w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(g60Var2.f37887x2, 80L);
                    g60Var2.R1 = false;
                    g60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                g60 g60Var3 = this.f41830b;
                int i10 = g60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    g60Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f41830b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.f41830b.f37823i0);
                return;
            case 5:
                this.f41830b.dismiss();
                return;
            case 6:
                g60 g60Var4 = this.f41830b;
                g60Var4.L1();
                AndroidUtilities.runOnUIThread(g60Var4.D1, 1000L);
                return;
            case 7:
                b50 b50Var = this.f41830b.f37858r0;
                if (b50Var != null) {
                    b50Var.show();
                    return;
                }
                return;
            case 8:
                g60.v(this.f41830b);
                return;
            case 9:
                this.f41830b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                g60 g60Var5 = this.f41830b;
                g60Var5.f37888x3 = null;
                g60Var5.I1(true);
                return;
        }
    }
}
