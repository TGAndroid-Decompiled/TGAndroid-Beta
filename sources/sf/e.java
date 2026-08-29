package sf;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f47781a;
    public final f f47782b;

    public e(f fVar, int i10) {
        this.f47781a = i10;
        this.f47782b = fVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47781a;
        f fVar = this.f47782b;
        switch (i10) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.f47788a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f47795s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f47795s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f47795s);
                remove2.remove("dialog_botflags" + fVar.f47795s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f47795s));
                g.a(i11).f47810f = false;
                return;
            default:
                ye.d.s(fVar.getContext(), fVar.f47797x);
                return;
        }
    }
}
