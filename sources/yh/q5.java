package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;
public final class q5 implements Runnable {
    public final int f47918a;
    public final s5 f47919b;

    public q5(s5 s5Var, int i10) {
        this.f47918a = i10;
        this.f47919b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47918a;
        s5 s5Var = this.f47919b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                qc qcVar = s5Var.d;
                t5 t5Var = s5Var.f48015q;
                q5 q5Var = s5Var.f48014p;
                MessageObject messageObject = s5Var.f48003b;
                if (!s5Var.f48010l) {
                    s5Var.f48010l = true;
                    messageObject.addPaidReactions((int) s5Var.f48009k, true, s5Var.c());
                    long j3 = t5Var.f48046g;
                    int i11 = t5Var.f48042a;
                    t5Var.f48046g = j3 + s5Var.f48009k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f48009k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f48011m) {
                    s5Var.f48011m = true;
                    s5Var.f48005f.f25289b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = q5Var;
                }
                s5Var.e.f25679b.setText(s5Var.d());
                return;
        }
    }
}
