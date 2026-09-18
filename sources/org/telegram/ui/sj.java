package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class sj implements org.telegram.ui.Components.oo {
    public final bo f37512a;

    public sj(bo boVar) {
        this.f37512a = boVar;
    }

    @Override
    public final void dismiss() {
        this.f37512a.f32306h0.M(null, null);
    }

    @Override
    public final void n() {
        bo boVar = this.f37512a;
        boVar.bc(true);
        org.telegram.ui.Components.vc.A(boVar, boVar.getMessagesController().isDialogMuted(boVar.T5, boVar.d()), boVar.f32279ea).j();
    }

    @Override
    public final void o() {
        bo boVar = this.f37512a;
        if (boVar.T5 != 0 && boVar.R3 != 3) {
            if (boVar.f32281f != null) {
                boVar.getMessagesController().putUser(boVar.f32281f, true);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", boVar.T5);
            if (boVar.d() != 0) {
                bundle.putLong("topic_id", boVar.d());
            }
            boVar.presentFragment(new y11(bundle, boVar.f32279ea));
        }
    }

    @Override
    public final void r() {
        int i10;
        bo boVar = this.f37512a;
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(boVar.T5, boVar.d()), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(boVar.T5, boVar.d()), z11).apply();
        if (org.telegram.ui.Components.vc.a(boVar)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, boVar, boVar.getResourceProvider()).j();
        }
        boVar.Pc(false);
    }

    @Override
    public final void t(int i10) {
        bo boVar = this.f37512a;
        if (i10 == 0) {
            if (boVar.getMessagesController().isDialogMuted(boVar.T5, boVar.d())) {
                boVar.bc(true);
            }
            if (org.telegram.ui.Components.vc.a(boVar)) {
                org.telegram.ui.Components.vc.z(boVar, 4, i10, boVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        boVar.getNotificationsController().muteUntil(boVar.T5, boVar.d(), i10);
        if (org.telegram.ui.Components.vc.a(boVar)) {
            org.telegram.ui.Components.vc.z(boVar, 5, i10, boVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
    }
}
