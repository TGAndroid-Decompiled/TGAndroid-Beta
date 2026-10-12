package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;
public final class k5 implements Runnable {
    public final int f53022a;
    public final m5 f53023b;

    public k5(m5 m5Var, int i10) {
        this.f53022a = i10;
        this.f53023b = m5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f53022a;
        m5 m5Var = this.f53023b;
        switch (i10) {
            case 0:
                m5Var.b();
                return;
            case 1:
                m5Var.a();
                return;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.f53118q;
                k5 k5Var = m5Var.f53117p;
                MessageObject messageObject = m5Var.f53105b;
                if (!m5Var.f53113l) {
                    m5Var.f53113l = true;
                    messageObject.addPaidReactions((int) m5Var.f53112k, true, m5Var.c());
                    long j3 = n5Var.f53151g;
                    int i11 = n5Var.f53146a;
                    n5Var.f53151g = j3 + m5Var.f53112k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.f53112k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.f53114m) {
                    m5Var.f53114m = true;
                    m5Var.f53108f.f28138b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.f53107e.f28522b.setText(m5Var.d());
                return;
        }
    }
}
