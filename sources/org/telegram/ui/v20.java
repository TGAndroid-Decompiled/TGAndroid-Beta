package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class v20 implements Runnable {
    public final int f38381a;
    public final i60 f38382b;

    public v20(i60 i60Var, int i10) {
        this.f38381a = i10;
        this.f38382b = i60Var;
    }

    @Override
    public final void run() {
        switch (this.f38381a) {
            case 0:
                i60 i60Var = this.f38382b;
                if (i60Var.r1() && AndroidUtilities.checkInlinePermissions(i60Var.f34393i0) && !org.telegram.ui.Components.voip.j1.f29408d0.V) {
                    i60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new v20(i60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                i60 i60Var2 = this.f38382b;
                if (i60Var2.f34360a1 != null && i60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        i60Var2.f34449w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(i60Var2.f34457x2, 80L);
                    i60Var2.R1 = false;
                    i60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                i60 i60Var3 = this.f38382b;
                int i10 = i60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    i60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f38382b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.f38382b.f34393i0);
                return;
            case 5:
                this.f38382b.dismiss();
                return;
            case 6:
                i60 i60Var4 = this.f38382b;
                i60Var4.K1();
                AndroidUtilities.runOnUIThread(i60Var4.D1, 1000L);
                return;
            case 7:
                d50 d50Var = this.f38382b.f34428r0;
                if (d50Var != null) {
                    d50Var.show();
                    return;
                }
                return;
            case 8:
                i60.t(this.f38382b);
                return;
            case 9:
                this.f38382b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                i60 i60Var5 = this.f38382b;
                i60Var5.f34458x3 = null;
                i60Var5.H1(true);
                return;
        }
    }
}
