package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class tj implements org.telegram.ui.Components.to {
    public final eo f36952a;

    public tj(eo eoVar) {
        this.f36952a = eoVar;
    }

    @Override
    public final void dismiss() {
        this.f36952a.f32342h0.M(null, null);
    }

    @Override
    public final void n() {
        eo eoVar = this.f36952a;
        eoVar.bc(true);
        org.telegram.ui.Components.wc.A(eoVar, eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d()), eoVar.f32316ea).j();
    }

    @Override
    public final void o() {
        eo eoVar = this.f36952a;
        if (eoVar.T5 != 0 && eoVar.R3 != 3) {
            if (eoVar.f32318f != null) {
                eoVar.getMessagesController().putUser(eoVar.f32318f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", eoVar.T5);
            if (eoVar.d() != 0) {
                bundle.putLong("topic_id", eoVar.d());
            }
            eoVar.presentFragment(new c21(bundle, eoVar.f32316ea));
        }
    }

    @Override
    public final void r() {
        int i10;
        eo eoVar = this.f36952a;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(eoVar.T5, eoVar.d()), z11).apply();
        if (org.telegram.ui.Components.wc.a(eoVar)) {
            org.telegram.ui.Components.wc.S(z10 ? 1 : 0, eoVar, eoVar.getResourceProvider()).j();
        }
        eoVar.Pc(false);
    }

    @Override
    public final void t(int i10) {
        eo eoVar = this.f36952a;
        if (i10 == 0) {
            if (eoVar.getMessagesController().isDialogMuted(eoVar.T5, eoVar.d())) {
                eoVar.bc(true);
            }
            if (org.telegram.ui.Components.wc.a(eoVar)) {
                org.telegram.ui.Components.wc.z(eoVar, 4, i10, eoVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        eoVar.getNotificationsController().muteUntil(eoVar.T5, eoVar.d(), i10);
        if (org.telegram.ui.Components.wc.a(eoVar)) {
            org.telegram.ui.Components.wc.z(eoVar, 5, i10, eoVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
    }
}
