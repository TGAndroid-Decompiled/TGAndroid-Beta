package uf;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f45275a;
    public final e f45276b;

    public d(e eVar, int i10) {
        this.f45275a = i10;
        this.f45276b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45275a;
        e eVar = this.f45276b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f45281a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f45287s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f45287s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f45287s);
                remove2.remove("dialog_botflags" + eVar.f45287s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f45287s));
                f.a(i11).f45302f = false;
                return;
            default:
                af.g.s(eVar.getContext(), eVar.f45289x);
                return;
        }
    }
}
