package vf;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f49052a;
    public final e f49053b;

    public d(e eVar, int i10) {
        this.f49052a = i10;
        this.f49053b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49052a;
        e eVar = this.f49053b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f49058a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f49065s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f49065s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f49065s);
                remove2.remove("dialog_botflags" + eVar.f49065s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f49065s));
                f.a(i11).f49081f = false;
                return;
            default:
                af.g.s(eVar.getContext(), eVar.f49067x);
                return;
        }
    }
}
