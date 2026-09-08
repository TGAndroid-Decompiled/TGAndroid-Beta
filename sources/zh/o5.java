package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;
public final class o5 implements Runnable {
    public final int f52419a;
    public final r5 f52420b;

    public o5(r5 r5Var, int i10) {
        this.f52419a = i10;
        this.f52420b = r5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f52419a;
        r5 r5Var = this.f52420b;
        switch (i10) {
            case 0:
                r5Var.b();
                return;
            case 1:
                r5Var.a();
                return;
            default:
                qc qcVar = r5Var.d;
                s5 s5Var = r5Var.f52557q;
                o5 o5Var = r5Var.f52556p;
                MessageObject messageObject = r5Var.f52544b;
                if (!r5Var.f52552l) {
                    r5Var.f52552l = true;
                    messageObject.addPaidReactions((int) r5Var.f52551k, true, r5Var.c());
                    long j3 = s5Var.f52602g;
                    int i11 = s5Var.f52597a;
                    s5Var.f52602g = j3 + r5Var.f52551k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r5Var.f52551k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r5Var.f52553m) {
                    r5Var.f52553m = true;
                    r5Var.f52547f.f27455b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(o5Var);
                    AndroidUtilities.runOnUIThread(o5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = o5Var;
                }
                r5Var.f52546e.f27824b.setText(r5Var.d());
                return;
        }
    }
}
