package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class xj implements org.telegram.ui.Components.gp {
    public final eo f44031a;

    public xj(eo eoVar) {
        this.f44031a = eoVar;
    }

    @Override
    public final void dismiss() {
        this.f44031a.f37282h0.M(null, null);
    }

    @Override
    public final void k() {
        eo eoVar = this.f44031a;
        eoVar.fc(true);
        org.telegram.ui.Components.zc.A(eoVar, eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d()), eoVar.f37256ea).j();
    }

    @Override
    public final void l() {
        eo eoVar = this.f44031a;
        if (eoVar.T5 != 0 && eoVar.R3 != 3) {
            if (eoVar.f37258f != null) {
                eoVar.getMessagesController().putUser(eoVar.f37258f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", eoVar.T5);
            if (eoVar.d() != 0) {
                bundle.putLong("topic_id", eoVar.d());
            }
            eoVar.presentFragment(new x11(bundle, eoVar.f37256ea));
        }
    }

    @Override
    public final void q() {
        int i10;
        eo eoVar = this.f44031a;
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), z11).apply();
        if (org.telegram.ui.Components.zc.a(eoVar)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, eoVar, eoVar.getResourceProvider()).j();
        }
        eoVar.Tc(false);
    }

    @Override
    public final void t(int i10) {
        eo eoVar = this.f44031a;
        if (i10 == 0) {
            if (eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d())) {
                eoVar.fc(true);
            }
            if (org.telegram.ui.Components.zc.a(eoVar)) {
                org.telegram.ui.Components.zc.z(eoVar, 4, i10, eoVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        eoVar.getNotificationsController().muteUntil(eoVar.T5, eoVar.d(), i10);
        if (org.telegram.ui.Components.zc.a(eoVar)) {
            org.telegram.ui.Components.zc.z(eoVar, 5, i10, eoVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
