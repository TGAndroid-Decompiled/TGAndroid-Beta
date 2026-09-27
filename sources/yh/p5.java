package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;
public final class p5 implements Runnable {
    public final int f47929a;
    public final r5 f47930b;

    public p5(r5 r5Var, int i10) {
        this.f47929a = i10;
        this.f47930b = r5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47929a;
        r5 r5Var = this.f47930b;
        switch (i10) {
            case 0:
                r5Var.b();
                return;
            case 1:
                r5Var.a();
                return;
            default:
                qc qcVar = r5Var.d;
                s5 s5Var = r5Var.f48017q;
                p5 p5Var = r5Var.f48016p;
                MessageObject messageObject = r5Var.f48005b;
                if (!r5Var.f48012l) {
                    r5Var.f48012l = true;
                    messageObject.addPaidReactions((int) r5Var.f48011k, true, r5Var.c());
                    long j3 = s5Var.f48060g;
                    int i11 = s5Var.f48056a;
                    s5Var.f48060g = j3 + r5Var.f48011k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r5Var.f48011k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r5Var.f48013m) {
                    r5Var.f48013m = true;
                    r5Var.f48007f.f25444b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = p5Var;
                }
                r5Var.e.f25700b.setText(r5Var.d());
                return;
        }
    }
}
