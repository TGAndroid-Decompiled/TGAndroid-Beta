package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;
public final class k5 implements Runnable {
    public final int f50766a;
    public final m5 f50767b;

    public k5(m5 m5Var, int i10) {
        this.f50766a = i10;
        this.f50767b = m5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f50766a;
        m5 m5Var = this.f50767b;
        switch (i10) {
            case 0:
                m5Var.b();
                return;
            case 1:
                m5Var.a();
                return;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.f50837q;
                k5 k5Var = m5Var.f50836p;
                MessageObject messageObject = m5Var.f50825b;
                if (!m5Var.f50832l) {
                    m5Var.f50832l = true;
                    messageObject.addPaidReactions((int) m5Var.f50831k, true, m5Var.c());
                    long j10 = n5Var.f50869g;
                    int i11 = n5Var.f50865a;
                    n5Var.f50869g = j10 + m5Var.f50831k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.f50831k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.f50833m) {
                    m5Var.f50833m = true;
                    m5Var.f50827f.f26719b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.e.f27066b.setText(m5Var.d());
                return;
        }
    }
}
