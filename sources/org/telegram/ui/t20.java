package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class t20 implements Runnable {
    public final int f37635a;
    public final g60 f37636b;

    public t20(g60 g60Var, int i10) {
        this.f37635a = i10;
        this.f37636b = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f37635a) {
            case 0:
                g60 g60Var = this.f37636b;
                if (g60Var.r1() && AndroidUtilities.checkInlinePermissions(g60Var.f33759i0) && !org.telegram.ui.Components.voip.k1.f29363d0.V) {
                    g60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new t20(g60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                g60 g60Var2 = this.f37636b;
                if (g60Var2.f33726a1 != null && g60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        g60Var2.f33815w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(g60Var2.f33823x2, 80L);
                    g60Var2.R1 = false;
                    g60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                g60 g60Var3 = this.f37636b;
                int i10 = g60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    g60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37636b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.f37636b.f33759i0);
                return;
            case 5:
                this.f37636b.dismiss();
                return;
            case 6:
                g60 g60Var4 = this.f37636b;
                g60Var4.K1();
                AndroidUtilities.runOnUIThread(g60Var4.D1, 1000L);
                return;
            case 7:
                b50 b50Var = this.f37636b.f33794r0;
                if (b50Var != null) {
                    b50Var.show();
                    return;
                }
                return;
            case 8:
                g60.t(this.f37636b);
                return;
            case 9:
                this.f37636b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                g60 g60Var5 = this.f37636b;
                g60Var5.f33824x3 = null;
                g60Var5.H1(true);
                return;
        }
    }
}
