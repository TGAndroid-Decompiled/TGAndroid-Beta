package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class v20 implements Runnable {
    public final int f41527a;
    public final h60 f41528b;

    public v20(h60 h60Var, int i10) {
        this.f41527a = i10;
        this.f41528b = h60Var;
    }

    @Override
    public final void run() {
        switch (this.f41527a) {
            case 0:
                h60 h60Var = this.f41528b;
                if (h60Var.r1() && AndroidUtilities.checkInlinePermissions(h60Var.f36908i0) && !org.telegram.ui.Components.voip.k1.f31931d0.V) {
                    h60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(h60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                h60 h60Var2 = this.f41528b;
                if (h60Var2.f36874a1 != null && h60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        h60Var2.f36964w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(h60Var2.f36972x2, 80L);
                    h60Var2.R1 = false;
                    h60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                h60 h60Var3 = this.f41528b;
                int i10 = h60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    h60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f41528b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.f41528b.f36908i0);
                return;
            case 5:
                this.f41528b.dismiss();
                return;
            case 6:
                h60 h60Var4 = this.f41528b;
                h60Var4.K1();
                AndroidUtilities.runOnUIThread(h60Var4.D1, 1000L);
                return;
            case 7:
                d50 d50Var = this.f41528b.f36943r0;
                if (d50Var != null) {
                    d50Var.show();
                    return;
                }
                return;
            case 8:
                h60.t(this.f41528b);
                return;
            case 9:
                this.f41528b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                h60 h60Var5 = this.f41528b;
                h60Var5.f36973x3 = null;
                h60Var5.H1(true);
                return;
        }
    }
}
