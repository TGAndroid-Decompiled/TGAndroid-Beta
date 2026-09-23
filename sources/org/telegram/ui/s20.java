package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class s20 implements Runnable {
    public final int f37105a;
    public final f60 f37106b;

    public s20(f60 f60Var, int i10) {
        this.f37105a = i10;
        this.f37106b = f60Var;
    }

    @Override
    public final void run() {
        switch (this.f37105a) {
            case 0:
                f60 f60Var = this.f37106b;
                if (f60Var.r1() && AndroidUtilities.checkInlinePermissions(f60Var.f33132i0) && !org.telegram.ui.Components.voip.j1.f28976d0.V) {
                    f60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new s20(f60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                f60 f60Var2 = this.f37106b;
                if (f60Var2.f33099a1 != null && f60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        f60Var2.f33188w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(f60Var2.f33196x2, 80L);
                    f60Var2.R1 = false;
                    f60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                f60 f60Var3 = this.f37106b;
                int i10 = f60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37106b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.j1.n(this.f37106b.f33132i0);
                return;
            case 5:
                this.f37106b.dismiss();
                return;
            case 6:
                f60 f60Var4 = this.f37106b;
                f60Var4.K1();
                AndroidUtilities.runOnUIThread(f60Var4.D1, 1000L);
                return;
            case 7:
                a50 a50Var = this.f37106b.f33167r0;
                if (a50Var != null) {
                    a50Var.show();
                    return;
                }
                return;
            case 8:
                f60.t(this.f37106b);
                return;
            case 9:
                this.f37106b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                f60 f60Var5 = this.f37106b;
                f60Var5.f33197x3 = null;
                f60Var5.H1(true);
                return;
        }
    }
}
