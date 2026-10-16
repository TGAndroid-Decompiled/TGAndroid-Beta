package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class z20 implements Runnable {
    public final int f42142a;
    public final n60 f42143b;

    public z20(n60 n60Var, int i10) {
        this.f42142a = i10;
        this.f42143b = n60Var;
    }

    @Override
    public final void run() {
        switch (this.f42142a) {
            case 0:
                n60 n60Var = this.f42143b;
                if (n60Var.s1() && AndroidUtilities.checkInlinePermissions(n60Var.f38190i0) && !org.telegram.ui.Components.voip.h1.f29878d0.V) {
                    n60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new z20(n60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                n60 n60Var2 = this.f42143b;
                if (n60Var2.f38157a1 != null && n60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        n60Var2.f38247w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    n60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(n60Var2.f38255x2, 80L);
                    n60Var2.R1 = false;
                    n60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                n60 n60Var3 = this.f42143b;
                int i10 = n60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    n60Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f42143b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f42143b.f38190i0);
                return;
            case 5:
                this.f42143b.dismiss();
                return;
            case 6:
                n60 n60Var4 = this.f42143b;
                n60Var4.L1();
                AndroidUtilities.runOnUIThread(n60Var4.D1, 1000L);
                return;
            case 7:
                h50 h50Var = this.f42143b.f38226r0;
                if (h50Var != null) {
                    h50Var.show();
                    return;
                }
                return;
            case 8:
                n60.v(this.f42143b);
                return;
            case 9:
                this.f42143b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                n60 n60Var5 = this.f42143b;
                n60Var5.f38256x3 = null;
                n60Var5.I1(true);
                return;
        }
    }
}
