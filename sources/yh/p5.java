package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;
public final class p5 implements Runnable {
    public final int f47869a;
    public final s5 f47870b;

    public p5(s5 s5Var, int i10) {
        this.f47869a = i10;
        this.f47870b = s5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47869a;
        s5 s5Var = this.f47870b;
        switch (i10) {
            case 0:
                s5Var.b();
                return;
            case 1:
                s5Var.a();
                return;
            default:
                qc qcVar = s5Var.d;
                t5 t5Var = s5Var.f48002q;
                p5 p5Var = s5Var.f48001p;
                MessageObject messageObject = s5Var.f47990b;
                if (!s5Var.f47997l) {
                    s5Var.f47997l = true;
                    messageObject.addPaidReactions((int) s5Var.f47996k, true, s5Var.c());
                    long j3 = t5Var.f48032g;
                    int i11 = t5Var.f48028a;
                    t5Var.f48032g = j3 + s5Var.f47996k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.f47996k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.f47998m) {
                    s5Var.f47998m = true;
                    s5Var.f47992f.f25359b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = p5Var;
                }
                s5Var.e.f25728b.setText(s5Var.d());
                return;
        }
    }
}
