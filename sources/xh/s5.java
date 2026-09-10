package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pc;
public final class s5 implements Runnable {
    public final int f46035a;
    public final u5 f46036b;

    public s5(u5 u5Var, int i10) {
        this.f46035a = i10;
        this.f46036b = u5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46035a;
        u5 u5Var = this.f46036b;
        switch (i10) {
            case 0:
                u5Var.b();
                return;
            case 1:
                u5Var.a();
                return;
            default:
                pc pcVar = u5Var.d;
                v5 v5Var = u5Var.f46153q;
                s5 s5Var = u5Var.f46152p;
                MessageObject messageObject = u5Var.f46141b;
                if (!u5Var.f46148l) {
                    u5Var.f46148l = true;
                    messageObject.addPaidReactions((int) u5Var.f46147k, true, u5Var.c());
                    long j3 = v5Var.f46180g;
                    int i11 = v5Var.f46176a;
                    v5Var.f46180g = j3 + u5Var.f46147k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    u5Var.f46147k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!u5Var.f46149m) {
                    u5Var.f46149m = true;
                    u5Var.f46143f.f23985b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(s5Var);
                    AndroidUtilities.runOnUIThread(s5Var, 5000L);
                    pcVar.k(true);
                    pcVar.v = s5Var;
                }
                u5Var.e.f24342b.setText(u5Var.d());
                return;
        }
    }
}
