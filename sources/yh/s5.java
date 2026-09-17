package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.oc;
public final class s5 implements Runnable {
    public final int f47809a;
    public final u5 f47810b;

    public s5(u5 u5Var, int i10) {
        this.f47809a = i10;
        this.f47810b = u5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47809a;
        u5 u5Var = this.f47810b;
        switch (i10) {
            case 0:
                u5Var.b();
                return;
            case 1:
                u5Var.a();
                return;
            default:
                oc ocVar = u5Var.d;
                v5 v5Var = u5Var.f47895q;
                s5 s5Var = u5Var.f47894p;
                MessageObject messageObject = u5Var.f47883b;
                if (!u5Var.f47890l) {
                    u5Var.f47890l = true;
                    messageObject.addPaidReactions((int) u5Var.f47889k, true, u5Var.c());
                    long j3 = v5Var.f47922g;
                    int i11 = v5Var.f47918a;
                    v5Var.f47922g = j3 + u5Var.f47889k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    u5Var.f47889k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!u5Var.f47891m) {
                    u5Var.f47891m = true;
                    u5Var.f47885f.f24623b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(s5Var);
                    AndroidUtilities.runOnUIThread(s5Var, 5000L);
                    ocVar.k(true);
                    ocVar.v = s5Var;
                }
                u5Var.e.f24923b.setText(u5Var.d());
                return;
        }
    }
}
