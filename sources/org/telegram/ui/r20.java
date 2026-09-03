package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class r20 implements Runnable {
    public final int f37680a;
    public final e60 f37681b;

    public r20(e60 e60Var, int i10) {
        this.f37680a = i10;
        this.f37681b = e60Var;
    }

    @Override
    public final void run() {
        switch (this.f37680a) {
            case 0:
                e60 e60Var = this.f37681b;
                if (e60Var.r1() && AndroidUtilities.checkInlinePermissions(e60Var.f33638f0) && !org.telegram.ui.Components.voip.g1.f29608a0.S) {
                    e60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new r20(e60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                e60 e60Var2 = this.f37681b;
                if (e60Var2.X0 != null && e60Var2.O1 && VoIPService.getSharedInstance() != null) {
                    try {
                        e60Var2.f33707w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(e60Var2.f33701u2, 80L);
                    e60Var2.O1 = false;
                    e60Var2.P1 = true;
                    return;
                }
                return;
            case 2:
                e60 e60Var3 = this.f37681b;
                int i10 = e60Var3.Q1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37681b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.f37681b.f33638f0);
                return;
            case 5:
                this.f37681b.dismiss();
                return;
            case 6:
                e60 e60Var4 = this.f37681b;
                e60Var4.K1();
                AndroidUtilities.runOnUIThread(e60Var4.A1, 1000L);
                return;
            case 7:
                a50 a50Var = this.f37681b.f33673o0;
                if (a50Var != null) {
                    a50Var.show();
                    return;
                }
                return;
            case 8:
                e60.t(this.f37681b);
                return;
            case 9:
                this.f37681b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                e60 e60Var5 = this.f37681b;
                e60Var5.f33702u3 = null;
                e60Var5.H1(true);
                return;
        }
    }
}
