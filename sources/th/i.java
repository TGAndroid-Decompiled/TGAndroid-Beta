package th;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class i implements Runnable {
    public final int f48166a;
    public final n f48167b;

    public i(n nVar, int i10) {
        this.f48166a = i10;
        this.f48167b = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48166a;
        n nVar = this.f48167b;
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
