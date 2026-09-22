package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.oc;
public final class r5 implements Runnable {
    public final int f47672a;
    public final t5 f47673b;

    public r5(t5 t5Var, int i10) {
        this.f47672a = i10;
        this.f47673b = t5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47672a;
        t5 t5Var = this.f47673b;
        switch (i10) {
            case 0:
                t5Var.b();
                return;
            case 1:
                t5Var.a();
                return;
            default:
                oc ocVar = t5Var.d;
                u5 u5Var = t5Var.f47777q;
                r5 r5Var = t5Var.f47776p;
                MessageObject messageObject = t5Var.f47765b;
                if (!t5Var.f47772l) {
                    t5Var.f47772l = true;
                    messageObject.addPaidReactions((int) t5Var.f47771k, true, t5Var.c());
                    long j3 = u5Var.f47805g;
                    int i11 = u5Var.f47801a;
                    u5Var.f47805g = j3 + t5Var.f47771k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t5Var.f47771k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t5Var.f47773m) {
                    t5Var.f47773m = true;
                    t5Var.f47767f.f24662b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(r5Var);
                    AndroidUtilities.runOnUIThread(r5Var, 5000L);
                    ocVar.k(true);
                    ocVar.v = r5Var;
                }
                t5Var.e.f24998b.setText(t5Var.d());
                return;
        }
    }
}
