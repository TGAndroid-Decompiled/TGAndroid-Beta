package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rc;
public final class p5 implements Runnable {
    public final int f47988a;
    public final r5 f47989b;

    public p5(r5 r5Var, int i10) {
        this.f47988a = i10;
        this.f47989b = r5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47988a;
        r5 r5Var = this.f47989b;
        switch (i10) {
            case 0:
                r5Var.b();
                return;
            case 1:
                r5Var.a();
                return;
            default:
                rc rcVar = r5Var.d;
                s5 s5Var = r5Var.f48077q;
                p5 p5Var = r5Var.f48076p;
                MessageObject messageObject = r5Var.f48065b;
                if (!r5Var.f48072l) {
                    r5Var.f48072l = true;
                    messageObject.addPaidReactions((int) r5Var.f48071k, true, r5Var.c());
                    long j3 = s5Var.f48123g;
                    int i11 = s5Var.f48119a;
                    s5Var.f48123g = j3 + r5Var.f48071k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r5Var.f48071k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r5Var.f48073m) {
                    r5Var.f48073m = true;
                    r5Var.f48067f.f25738b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p5Var);
                    AndroidUtilities.runOnUIThread(p5Var, 5000L);
                    rcVar.k(true);
                    rcVar.v = p5Var;
                }
                r5Var.e.f25963b.setText(r5Var.d());
                return;
        }
    }
}
