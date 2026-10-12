package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class v20 implements Runnable {
    public final int f42648a;
    public final i60 f42649b;

    public v20(i60 i60Var, int i10) {
        this.f42648a = i10;
        this.f42649b = i60Var;
    }

    @Override
    public final void run() {
        switch (this.f42648a) {
            case 0:
                i60 i60Var = this.f42649b;
                if (i60Var.s1() && AndroidUtilities.checkInlinePermissions(i60Var.f38712i0) && !org.telegram.ui.Components.voip.k1.f31757d0.V) {
                    i60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(i60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                i60 i60Var2 = this.f42649b;
                if (i60Var2.f38678a1 != null && i60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        i60Var2.f38768w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i60Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(i60Var2.f38776x2, 80L);
                    i60Var2.R1 = false;
                    i60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                i60 i60Var3 = this.f42649b;
                int i10 = i60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    i60Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f42649b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.f42649b.f38712i0);
                return;
            case 5:
                this.f42649b.dismiss();
                return;
            case 6:
                i60 i60Var4 = this.f42649b;
                i60Var4.L1();
                AndroidUtilities.runOnUIThread(i60Var4.D1, 1000L);
                return;
            case 7:
                d50 d50Var = this.f42649b.f38747r0;
                if (d50Var != null) {
                    d50Var.show();
                    return;
                }
                return;
            case 8:
                i60.v(this.f42649b);
                return;
            case 9:
                this.f42649b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                i60 i60Var5 = this.f42649b;
                i60Var5.f38777x3 = null;
                i60Var5.I1(true);
                return;
        }
    }
}
