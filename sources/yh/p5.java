package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rc;
public final class p5 implements Runnable {
    public final int f51814a;
    public final s5 f51815b;

    public p5(s5 s5Var, int i10) {
        this.f51814a = i10;
        this.f51815b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51814a;
        s5 s5Var = this.f51815b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                rc rcVar = s5Var.d;
                t5 t5Var = s5Var.f51977q;
                p5 p5Var = s5Var.f51976p;
                MessageObject messageObject = s5Var.f51964b;
                if (!s5Var.f51972l) {
                    s5Var.f51972l = true;
                    messageObject.addPaidReactions((int) s5Var.f51971k, true, s5Var.c());
                    long j3 = t5Var.f52015g;
                    int i11 = t5Var.f52010a;
                    t5Var.f52015g = j3 + s5Var.f51971k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f51971k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f51973m) {
                    s5Var.f51973m = true;
                    s5Var.f51967f.f28063b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    rcVar.k(true);
                    rcVar.v = p5Var;
                }
                s5Var.f51966e.f28329b.setText(s5Var.d());
                return;
        }
    }
}
