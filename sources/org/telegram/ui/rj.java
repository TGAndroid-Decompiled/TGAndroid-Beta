package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class rj implements org.telegram.ui.Components.no {
    public final co f40184a;

    public rj(co coVar) {
        this.f40184a = coVar;
    }

    @Override
    public final void dismiss() {
        this.f40184a.f35274h0.M(null, null);
    }

    @Override
    public final void n() {
        co coVar = this.f40184a;
        coVar.bc(true);
        org.telegram.ui.Components.yc.A(coVar, coVar.getMessagesController().isDialogMuted(coVar.T5, coVar.d()), coVar.f35248ea).j();
    }

    @Override
    public final void p() {
        co coVar = this.f40184a;
        if (coVar.T5 != 0 && coVar.R3 != 3) {
            if (coVar.f35250f != null) {
                coVar.getMessagesController().putUser(coVar.f35250f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", coVar.T5);
            if (coVar.d() != 0) {
                bundle.putLong("topic_id", coVar.d());
            }
            coVar.presentFragment(new y11(bundle, coVar.f35248ea));
        }
    }

    @Override
    public final void s() {
        int i10;
        co coVar = this.f40184a;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(coVar.T5, coVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(coVar.T5, coVar.d()), z11).apply();
        if (org.telegram.ui.Components.yc.a(coVar)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, coVar, coVar.getResourceProvider()).j();
        }
        coVar.Pc(false);
    }

    @Override
    public final void x(int i10) {
        co coVar = this.f40184a;
        if (i10 == 0) {
            if (coVar.getMessagesController().isDialogMuted(coVar.T5, coVar.d())) {
                coVar.bc(true);
            }
            if (org.telegram.ui.Components.yc.a(coVar)) {
                org.telegram.ui.Components.yc.z(coVar, 4, i10, coVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        coVar.getNotificationsController().muteUntil(coVar.T5, coVar.d(), i10);
        if (org.telegram.ui.Components.yc.a(coVar)) {
            org.telegram.ui.Components.yc.z(coVar, 5, i10, coVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
