package qh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class i implements Runnable {
    public final int f46711a;
    public final n f46712b;

    public i(n nVar, int i10) {
        this.f46711a = i10;
        this.f46712b = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.f46711a;
        n nVar = this.f46712b;
        switch (i10) {
            case 0:
                n.W(nVar);
                return;
            default:
                nVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                return;
        }
    }
}
