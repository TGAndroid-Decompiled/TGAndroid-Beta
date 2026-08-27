package qf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

public final class f implements Runnable {

    public final int f46285a;

    public final g f46286b;

    public f(g gVar, int i10) {
        this.f46285a = i10;
        this.f46286b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f46285a;
        g gVar = this.f46286b;
        switch (i10) {
            case 0:
                gVar.a();
                break;
            case 1:
                gVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = gVar.f46292a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(gVar.f46299s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                MessagesController.getNotificationsSettings(i11).edit().remove("dialog_botid" + gVar.f46299s).remove("dialog_boturl" + gVar.f46299s).remove("dialog_botflags" + gVar.f46299s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(gVar.f46299s));
                h.a(i11).f46313f = false;
                break;
            default:
                we.e.s(gVar.getContext(), gVar.f46301x);
                break;
        }
    }
}
