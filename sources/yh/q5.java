package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rc;
public final class q5 implements Runnable {
    public final int f51875a;
    public final t5 f51876b;

    public q5(t5 t5Var, int i10) {
        this.f51875a = i10;
        this.f51876b = t5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51875a;
        t5 t5Var = this.f51876b;
        switch (i10) {
            case 0:
                t5Var.b();
                return;
            case 1:
                t5Var.a();
                return;
            default:
                rc rcVar = t5Var.d;
                u5 u5Var = t5Var.f52035q;
                q5 q5Var = t5Var.f52034p;
                MessageObject messageObject = t5Var.f52022b;
                if (!t5Var.f52030l) {
                    t5Var.f52030l = true;
                    messageObject.addPaidReactions((int) t5Var.f52029k, true, t5Var.c());
                    long j3 = u5Var.f52090g;
                    int i11 = u5Var.f52085a;
                    u5Var.f52090g = j3 + t5Var.f52029k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t5Var.f52029k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t5Var.f52031m) {
                    t5Var.f52031m = true;
                    t5Var.f52025f.f28155b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    rcVar.k(true);
                    rcVar.v = q5Var;
                }
                t5Var.f52024e.f28438b.setText(t5Var.d());
                return;
        }
    }
}
