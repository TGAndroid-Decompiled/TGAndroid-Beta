package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tc;
public final class j5 implements Runnable {
    public final int f52786a;
    public final l5 f52787b;

    public j5(l5 l5Var, int i10) {
        this.f52786a = i10;
        this.f52787b = l5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f52786a;
        l5 l5Var = this.f52787b;
        switch (i10) {
            case 0:
                l5Var.b();
                return;
            case 1:
                l5Var.a();
                return;
            default:
                tc tcVar = l5Var.d;
                m5 m5Var = l5Var.f52893q;
                j5 j5Var = l5Var.f52892p;
                MessageObject messageObject = l5Var.f52880b;
                if (!l5Var.f52888l) {
                    l5Var.f52888l = true;
                    messageObject.addPaidReactions((int) l5Var.f52887k, true, l5Var.c());
                    long j3 = m5Var.f52929g;
                    int i11 = m5Var.f52924a;
                    m5Var.f52929g = j3 + l5Var.f52887k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    l5Var.f52887k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!l5Var.f52889m) {
                    l5Var.f52889m = true;
                    l5Var.f52883f.f28759b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(j5Var);
                    AndroidUtilities.runOnUIThread(j5Var, 5000L);
                    tcVar.k(true);
                    tcVar.v = j5Var;
                }
                l5Var.f52882e.f29096b.setText(l5Var.d());
                return;
        }
    }
}
