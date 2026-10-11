package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;
public final class k5 implements Runnable {
    public final int f52907a;
    public final m5 f52908b;

    public k5(m5 m5Var, int i10) {
        this.f52907a = i10;
        this.f52908b = m5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f52907a;
        m5 m5Var = this.f52908b;
        switch (i10) {
            case 0:
                m5Var.b();
                return;
            case 1:
                m5Var.a();
                return;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.f53003q;
                k5 k5Var = m5Var.f53002p;
                MessageObject messageObject = m5Var.f52990b;
                if (!m5Var.f52998l) {
                    m5Var.f52998l = true;
                    messageObject.addPaidReactions((int) m5Var.f52997k, true, m5Var.c());
                    long j3 = n5Var.f53036g;
                    int i11 = n5Var.f53031a;
                    n5Var.f53036g = j3 + m5Var.f52997k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.f52997k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.f52999m) {
                    m5Var.f52999m = true;
                    m5Var.f52993f.f28339b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.f52992e.f28830b.setText(m5Var.d());
                return;
        }
    }
}
