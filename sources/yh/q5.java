package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;
public final class q5 implements Runnable {
    public final int f47602a;
    public final s5 f47603b;

    public q5(s5 s5Var, int i10) {
        this.f47602a = i10;
        this.f47603b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47602a;
        s5 s5Var = this.f47603b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                qc qcVar = s5Var.d;
                t5 t5Var = s5Var.f47708q;
                q5 q5Var = s5Var.f47707p;
                MessageObject messageObject = s5Var.f47696b;
                if (!s5Var.f47703l) {
                    s5Var.f47703l = true;
                    messageObject.addPaidReactions((int) s5Var.f47702k, true, s5Var.c());
                    long j3 = t5Var.f47736g;
                    int i11 = t5Var.f47732a;
                    t5Var.f47736g = j3 + s5Var.f47702k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f47702k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f47704m) {
                    s5Var.f47704m = true;
                    s5Var.f47698f.f25246b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = q5Var;
                }
                s5Var.e.f25578b.setText(s5Var.d());
                return;
        }
    }
}
