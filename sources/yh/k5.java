package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;
public final class k5 implements Runnable {
    public final int f53010a;
    public final m5 f53011b;

    public k5(m5 m5Var, int i10) {
        this.f53010a = i10;
        this.f53011b = m5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f53010a;
        m5 m5Var = this.f53011b;
        switch (i10) {
            case 0:
                m5Var.b();
                return;
            case 1:
                m5Var.a();
                return;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.f53106q;
                k5 k5Var = m5Var.f53105p;
                MessageObject messageObject = m5Var.f53093b;
                if (!m5Var.f53101l) {
                    m5Var.f53101l = true;
                    messageObject.addPaidReactions((int) m5Var.f53100k, true, m5Var.c());
                    long j3 = n5Var.f53139g;
                    int i11 = n5Var.f53134a;
                    n5Var.f53139g = j3 + m5Var.f53100k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.f53100k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.f53102m) {
                    m5Var.f53102m = true;
                    m5Var.f53096f.f28153b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.f53095e.f28527b.setText(m5Var.d());
                return;
        }
    }
}
