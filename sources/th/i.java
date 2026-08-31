package th;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class i implements Runnable {
    public final int f48130a;
    public final n f48131b;

    public i(n nVar, int i10) {
        this.f48130a = i10;
        this.f48131b = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48130a;
        n nVar = this.f48131b;
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
