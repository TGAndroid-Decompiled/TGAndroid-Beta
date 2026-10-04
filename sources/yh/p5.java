package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rc;
public final class p5 implements Runnable {
    public final int f51811a;
    public final s5 f51812b;

    public p5(s5 s5Var, int i10) {
        this.f51811a = i10;
        this.f51812b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f51811a;
        s5 s5Var = this.f51812b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                rc rcVar = s5Var.d;
                t5 t5Var = s5Var.f51983q;
                p5 p5Var = s5Var.f51982p;
                MessageObject messageObject = s5Var.f51970b;
                if (!s5Var.f51978l) {
                    s5Var.f51978l = true;
                    messageObject.addPaidReactions((int) s5Var.f51977k, true, s5Var.c());
                    long j3 = t5Var.f52021g;
                    int i11 = t5Var.f52016a;
                    t5Var.f52021g = j3 + s5Var.f51977k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f51977k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f51979m) {
                    s5Var.f51979m = true;
                    s5Var.f51973f.f28069b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    rcVar.k(true);
                    rcVar.v = p5Var;
                }
                s5Var.f51972e.f28335b.setText(s5Var.d());
                return;
        }
    }
}
