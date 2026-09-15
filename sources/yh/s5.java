package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.oc;
public final class s5 implements Runnable {
    public final int f47786a;
    public final u5 f47787b;

    public s5(u5 u5Var, int i10) {
        this.f47786a = i10;
        this.f47787b = u5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47786a;
        u5 u5Var = this.f47787b;
        switch (i10) {
            case 0:
                u5Var.b();
                return;
            case 1:
                u5Var.a();
                return;
            default:
                oc ocVar = u5Var.d;
                v5 v5Var = u5Var.f47872q;
                s5 s5Var = u5Var.f47871p;
                MessageObject messageObject = u5Var.f47860b;
                if (!u5Var.f47867l) {
                    u5Var.f47867l = true;
                    messageObject.addPaidReactions((int) u5Var.f47866k, true, u5Var.c());
                    long j3 = v5Var.f47899g;
                    int i11 = v5Var.f47895a;
                    v5Var.f47899g = j3 + u5Var.f47866k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    u5Var.f47866k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!u5Var.f47868m) {
                    u5Var.f47868m = true;
                    u5Var.f47862f.f24659b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(s5Var);
                    AndroidUtilities.runOnUIThread(s5Var, 5000L);
                    ocVar.k(true);
                    ocVar.v = s5Var;
                }
                u5Var.e.f24992b.setText(u5Var.d());
                return;
        }
    }
}
