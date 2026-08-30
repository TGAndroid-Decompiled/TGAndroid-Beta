package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class i implements Runnable {
    public final int f44349a;
    public final n f44350b;

    public i(n nVar, int i10) {
        this.f44349a = i10;
        this.f44350b = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.f44349a;
        n nVar = this.f44350b;
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
