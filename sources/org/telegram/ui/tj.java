package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class tj implements org.telegram.ui.Components.ep {
    public final zn f42235a;

    public tj(zn znVar) {
        this.f42235a = znVar;
    }

    @Override
    public final void dismiss() {
        this.f42235a.f44822h0.M(null, null);
    }

    @Override
    public final void o() {
        zn znVar = this.f42235a;
        znVar.fc(true);
        org.telegram.ui.Components.ad.A(znVar, znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d()), znVar.f44796ea).j();
    }

    @Override
    public final void p() {
        zn znVar = this.f42235a;
        if (znVar.T5 != 0 && znVar.R3 != 3) {
            if (znVar.f44798f != null) {
                znVar.getMessagesController().putUser(znVar.f44798f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", znVar.T5);
            if (znVar.d() != 0) {
                bundle.putLong("topic_id", znVar.d());
            }
            znVar.presentFragment(new u11(bundle, znVar.f44796ea));
        }
    }

    @Override
    public final void s() {
        int i10;
        zn znVar = this.f42235a;
        i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.T5, znVar.d()), z11).apply();
        if (org.telegram.ui.Components.ad.a(znVar)) {
            org.telegram.ui.Components.ad.S(z10 ? 1 : 0, znVar, znVar.getResourceProvider()).j();
        }
        znVar.Tc(false);
    }

    @Override
    public final void x(int i10) {
        zn znVar = this.f42235a;
        if (i10 == 0) {
            if (znVar.getMessagesController().isDialogMuted(znVar.T5, znVar.d())) {
                znVar.fc(true);
            }
            if (org.telegram.ui.Components.ad.a(znVar)) {
                org.telegram.ui.Components.ad.z(znVar, 4, i10, znVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        znVar.getNotificationsController().muteUntil(znVar.T5, znVar.d(), i10);
        if (org.telegram.ui.Components.ad.a(znVar)) {
            org.telegram.ui.Components.ad.z(znVar, 5, i10, znVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
