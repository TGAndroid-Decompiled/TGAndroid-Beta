package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rc;
public final class p5 implements Runnable {
    public final int f51815a;
    public final s5 f51816b;

    public p5(s5 s5Var, int i10) {
        this.f51815a = i10;
        this.f51816b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51815a;
        s5 s5Var = this.f51816b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                rc rcVar = s5Var.d;
                t5 t5Var = s5Var.f51978q;
                p5 p5Var = s5Var.f51977p;
                MessageObject messageObject = s5Var.f51965b;
                if (!s5Var.f51973l) {
                    s5Var.f51973l = true;
                    messageObject.addPaidReactions((int) s5Var.f51972k, true, s5Var.c());
                    long j3 = t5Var.f52016g;
                    int i11 = t5Var.f52011a;
                    t5Var.f52016g = j3 + s5Var.f51972k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f51972k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f51974m) {
                    s5Var.f51974m = true;
                    s5Var.f51968f.f28064b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    rcVar.k(true);
                    rcVar.v = p5Var;
                }
                s5Var.f51967e.f28330b.setText(s5Var.d());
                return;
        }
    }
}
