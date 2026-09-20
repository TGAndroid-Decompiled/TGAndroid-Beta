package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pc;
public final class q5 implements Runnable {
    public final int f47955a;
    public final t5 f47956b;

    public q5(t5 t5Var, int i10) {
        this.f47955a = i10;
        this.f47956b = t5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47955a;
        t5 t5Var = this.f47956b;
        switch (i10) {
            case 0:
                t5Var.b();
                return;
            case 1:
                t5Var.a();
                return;
            default:
                pc pcVar = t5Var.d;
                u5 u5Var = t5Var.f48082q;
                q5 q5Var = t5Var.f48081p;
                MessageObject messageObject = t5Var.f48070b;
                if (!t5Var.f48077l) {
                    t5Var.f48077l = true;
                    messageObject.addPaidReactions((int) t5Var.f48076k, true, t5Var.c());
                    long j3 = u5Var.f48115g;
                    int i11 = u5Var.f48111a;
                    u5Var.f48115g = j3 + t5Var.f48076k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t5Var.f48076k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t5Var.f48078m) {
                    t5Var.f48078m = true;
                    t5Var.f48072f.f24988b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    pcVar.k(true);
                    pcVar.v = q5Var;
                }
                t5Var.e.f25336b.setText(t5Var.d());
                return;
        }
    }
}
