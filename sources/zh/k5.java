package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;
public final class k5 implements Runnable {
    public final int f50765a;
    public final m5 f50766b;

    public k5(m5 m5Var, int i10) {
        this.f50765a = i10;
        this.f50766b = m5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f50765a;
        m5 m5Var = this.f50766b;
        switch (i10) {
            case 0:
                m5Var.b();
                return;
            case 1:
                m5Var.a();
                return;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.f50836q;
                k5 k5Var = m5Var.f50835p;
                MessageObject messageObject = m5Var.f50824b;
                if (!m5Var.f50831l) {
                    m5Var.f50831l = true;
                    messageObject.addPaidReactions((int) m5Var.f50830k, true, m5Var.c());
                    long j10 = n5Var.f50868g;
                    int i11 = n5Var.f50864a;
                    n5Var.f50868g = j10 + m5Var.f50830k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.f50830k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.f50832m) {
                    m5Var.f50832m = true;
                    m5Var.f50826f.f27019b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.e.f27354b.setText(m5Var.d());
                return;
        }
    }
}
