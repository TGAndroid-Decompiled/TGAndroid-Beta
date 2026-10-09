package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tc;
public final class j5 implements Runnable {
    public final int f52740a;
    public final l5 f52741b;

    public j5(l5 l5Var, int i10) {
        this.f52740a = i10;
        this.f52741b = l5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f52740a;
        l5 l5Var = this.f52741b;
        switch (i10) {
            case 0:
                l5Var.b();
                return;
            case 1:
                l5Var.a();
                return;
            default:
                tc tcVar = l5Var.d;
                m5 m5Var = l5Var.f52847q;
                j5 j5Var = l5Var.f52846p;
                MessageObject messageObject = l5Var.f52834b;
                if (!l5Var.f52842l) {
                    l5Var.f52842l = true;
                    messageObject.addPaidReactions((int) l5Var.f52841k, true, l5Var.c());
                    long j3 = m5Var.f52883g;
                    int i11 = m5Var.f52878a;
                    m5Var.f52883g = j3 + l5Var.f52841k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    l5Var.f52841k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!l5Var.f52843m) {
                    l5Var.f52843m = true;
                    l5Var.f52837f.f28806b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(j5Var);
                    AndroidUtilities.runOnUIThread(j5Var, 5000L);
                    tcVar.k(true);
                    tcVar.v = j5Var;
                }
                l5Var.f52836e.f29140b.setText(l5Var.d());
                return;
        }
    }
}
