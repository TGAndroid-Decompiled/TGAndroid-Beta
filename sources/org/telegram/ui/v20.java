package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class v20 implements Runnable {
    public final int f42650a;
    public final i60 f42651b;

    public v20(i60 i60Var, int i10) {
        this.f42650a = i10;
        this.f42651b = i60Var;
    }

    @Override
    public final void run() {
        switch (this.f42650a) {
            case 0:
                i60 i60Var = this.f42651b;
                if (i60Var.s1() && AndroidUtilities.checkInlinePermissions(i60Var.f38715i0) && !org.telegram.ui.Components.voip.k1.f31742d0.V) {
                    i60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(i60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                i60 i60Var2 = this.f42651b;
                if (i60Var2.f38681a1 != null && i60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        i60Var2.f38771w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(i60Var2.f38779x2, 80L);
                    i60Var2.R1 = false;
                    i60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                i60 i60Var3 = this.f42651b;
                int i10 = i60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    i60Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f42651b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.f42651b.f38715i0);
                return;
            case 5:
                this.f42651b.dismiss();
                return;
            case 6:
                i60 i60Var4 = this.f42651b;
                i60Var4.L1();
                AndroidUtilities.runOnUIThread(i60Var4.D1, 1000L);
                return;
            case 7:
                d50 d50Var = this.f42651b.f38750r0;
                if (d50Var != null) {
                    d50Var.show();
                    return;
                }
                return;
            case 8:
                i60.v(this.f42651b);
                return;
            case 9:
                this.f42651b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                i60 i60Var5 = this.f42651b;
                i60Var5.f38780x3 = null;
                i60Var5.I1(true);
                return;
        }
    }
}
