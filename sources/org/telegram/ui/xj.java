package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class xj implements org.telegram.ui.Components.bp {
    public final fo f41582a;

    public xj(fo foVar) {
        this.f41582a = foVar;
    }

    @Override
    public final void dismiss() {
        this.f41582a.f35661h0.M(null, null);
    }

    @Override
    public final void o() {
        fo foVar = this.f41582a;
        foVar.fc(true);
        org.telegram.ui.Components.zc.A(foVar, foVar.getMessagesController().isDialogMuted(foVar.T5, foVar.d()), foVar.f35633ea).j();
    }

    @Override
    public final void p() {
        fo foVar = this.f41582a;
        if (foVar.T5 != 0 && foVar.R3 != 3) {
            if (foVar.f35636f != null) {
                foVar.getMessagesController().putUser(foVar.f35636f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", foVar.T5);
            if (foVar.d() != 0) {
                bundle.putLong("topic_id", foVar.d());
            }
            foVar.presentFragment(new c21(bundle, foVar.f35633ea));
        }
    }

    @Override
    public final void t() {
        int i10;
        fo foVar = this.f41582a;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(foVar.T5, foVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(foVar.T5, foVar.d()), z11).apply();
        if (org.telegram.ui.Components.zc.a(foVar)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, foVar, foVar.getResourceProvider()).j();
        }
        foVar.Tc(false);
    }

    @Override
    public final void y(int i10) {
        fo foVar = this.f41582a;
        if (i10 == 0) {
            if (foVar.getMessagesController().isDialogMuted(foVar.T5, foVar.d())) {
                foVar.fc(true);
            }
            if (org.telegram.ui.Components.zc.a(foVar)) {
                org.telegram.ui.Components.zc.z(foVar, 4, i10, foVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        foVar.getNotificationsController().muteUntil(foVar.T5, foVar.d(), i10);
        if (org.telegram.ui.Components.zc.a(foVar)) {
            org.telegram.ui.Components.zc.z(foVar, 5, i10, foVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
