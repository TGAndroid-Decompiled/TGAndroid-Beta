package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class v20 implements Runnable {
    public final int f41390a;
    public final j60 f41391b;

    public v20(j60 j60Var, int i10) {
        this.f41390a = i10;
        this.f41391b = j60Var;
    }

    @Override
    public final void run() {
        switch (this.f41390a) {
            case 0:
                j60 j60Var = this.f41391b;
                if (j60Var.r1() && AndroidUtilities.checkInlinePermissions(j60Var.f37547i0) && !org.telegram.ui.Components.voip.h1.f31516d0.V) {
                    j60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(j60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                j60 j60Var2 = this.f41391b;
                if (j60Var2.f37513a1 != null && j60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        j60Var2.f37603w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    j60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(j60Var2.f37611x2, 80L);
                    j60Var2.R1 = false;
                    j60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                j60 j60Var3 = this.f41391b;
                int i10 = j60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    j60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f41391b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f41391b.f37547i0);
                return;
            case 5:
                this.f41391b.dismiss();
                return;
            case 6:
                j60 j60Var4 = this.f41391b;
                j60Var4.K1();
                AndroidUtilities.runOnUIThread(j60Var4.D1, 1000L);
                return;
            case 7:
                d50 d50Var = this.f41391b.f37582r0;
                if (d50Var != null) {
                    d50Var.show();
                    return;
                }
                return;
            case 8:
                j60.t(this.f41391b);
                return;
            case 9:
                this.f41391b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                j60 j60Var5 = this.f41391b;
                j60Var5.f37612x3 = null;
                j60Var5.H1(true);
                return;
        }
    }
}
