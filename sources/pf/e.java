package pf;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f45605a;
    public final f f45606b;

    public e(f fVar, int i9) {
        this.f45605a = i9;
        this.f45606b = fVar;
    }

    @Override
    public final void run() {
        int i9 = this.f45605a;
        f fVar = this.f45606b;
        switch (i9) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = fVar.f45614a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i10).getInputPeer(fVar.f45621s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f45621s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f45621s);
                remove2.remove("dialog_botflags" + fVar.f45621s).apply();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f45621s));
                g.a(i10).f45635f = false;
                return;
            default:
                ve.e.s(fVar.getContext(), fVar.f45623x);
                return;
        }
    }
}
