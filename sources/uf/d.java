package uf;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f45339a;
    public final e f45340b;

    public d(e eVar, int i10) {
        this.f45339a = i10;
        this.f45340b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45339a;
        e eVar = this.f45340b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f45345a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f45351s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f45351s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f45351s);
                remove2.remove("dialog_botflags" + eVar.f45351s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f45351s));
                f.a(i11).f45364f = false;
                return;
            default:
                ze.d.s(eVar.getContext(), eVar.f45353x);
                return;
        }
    }
}
