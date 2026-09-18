package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class x20 implements Runnable {
    public final int f39355a;
    public final k60 f39356b;

    public x20(k60 k60Var, int i10) {
        this.f39355a = i10;
        this.f39356b = k60Var;
    }

    @Override
    public final void run() {
        switch (this.f39355a) {
            case 0:
                k60 k60Var = this.f39356b;
                if (k60Var.r1() && AndroidUtilities.checkInlinePermissions(k60Var.f35050i0) && !org.telegram.ui.Components.voip.j1.f28985d0.V) {
                    k60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new x20(k60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                k60 k60Var2 = this.f39356b;
                if (k60Var2.f35017a1 != null && k60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        k60Var2.f35106w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    k60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(k60Var2.f35114x2, 80L);
                    k60Var2.R1 = false;
                    k60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                k60 k60Var3 = this.f39356b;
                int i10 = k60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    k60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f39356b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.f39356b.f35050i0);
                return;
            case 5:
                this.f39356b.dismiss();
                return;
            case 6:
                k60 k60Var4 = this.f39356b;
                k60Var4.K1();
                AndroidUtilities.runOnUIThread(k60Var4.D1, 1000L);
                return;
            case 7:
                f50 f50Var = this.f39356b.f35085r0;
                if (f50Var != null) {
                    f50Var.show();
                    return;
                }
                return;
            case 8:
                k60.t(this.f39356b);
                return;
            case 9:
                this.f39356b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                k60 k60Var5 = this.f39356b;
                k60Var5.f35115x3 = null;
                k60Var5.H1(true);
                return;
        }
    }
}
