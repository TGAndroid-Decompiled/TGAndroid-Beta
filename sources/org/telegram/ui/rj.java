package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class rj implements org.telegram.ui.Components.oo {
    public final zn f37199a;

    public rj(zn znVar) {
        this.f37199a = znVar;
    }

    @Override
    public final void dismiss() {
        this.f37199a.f40351h0.M(null, null);
    }

    @Override
    public final void n() {
        zn znVar = this.f37199a;
        znVar.bc(true);
        org.telegram.ui.Components.xc.A(znVar, znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d()), znVar.f40324ea).j();
    }

    @Override
    public final void o() {
        zn znVar = this.f37199a;
        if (znVar.T5 != 0 && znVar.R3 != 3) {
            if (znVar.f40326f != null) {
                znVar.getMessagesController().putUser(znVar.f40326f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", znVar.T5);
            if (znVar.d() != 0) {
                bundle.putLong("topic_id", znVar.d());
            }
            znVar.presentFragment(new w11(bundle, znVar.f40324ea));
        }
    }

    @Override
    public final void r() {
        int i10;
        zn znVar = this.f37199a;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(znVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, znVar, znVar.getResourceProvider()).j();
        }
        znVar.Pc(false);
    }

    @Override
    public final void u(int i10) {
        zn znVar = this.f37199a;
        if (i10 == 0) {
            if (znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d())) {
                znVar.bc(true);
            }
            if (org.telegram.ui.Components.xc.a(znVar)) {
                org.telegram.ui.Components.xc.z(znVar, 4, i10, znVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        znVar.getNotificationsController().muteUntil(znVar.T5, znVar.d(), i10);
        if (org.telegram.ui.Components.xc.a(znVar)) {
            org.telegram.ui.Components.xc.z(znVar, 5, i10, znVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void k() {
    }
}
