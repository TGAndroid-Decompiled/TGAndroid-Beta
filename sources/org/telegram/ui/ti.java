package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class ti implements org.telegram.ui.Components.wn {
    public final wm f49812a;

    public ti(wm wmVar) {
        this.f49812a = wmVar;
    }

    @Override
    public final void dismiss() {
        this.f49812a.f51359j0.U(null, null);
    }

    @Override
    public final void q() {
        wm wmVar = this.f49812a;
        wmVar.Ec(true);
        org.telegram.ui.Components.fc.A(wmVar, wmVar.getMessagesController().r2(wmVar.f51376k6, wmVar.b(), null), wmVar.f51557ya).j();
    }

    @Override
    public final void t() {
        wm wmVar = this.f49812a;
        if (wmVar.f51376k6 != 0 && wmVar.f51325g4 != 3) {
            if (wmVar.f51306f != null) {
                wmVar.getMessagesController().X3(wmVar.f51306f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wmVar.f51376k6);
            if (wmVar.b() != 0) {
                bundle.putLong("topic_id", wmVar.b());
            }
            wmVar.presentFragment(new yw0(bundle, wmVar.f51557ya));
        }
    }

    @Override
    public final void v() {
        int i3;
        wm wmVar = this.f49812a;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22989d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.us.v(wmVar.f51376k6, wmVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.us.v(wmVar.f51376k6, wmVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.fc.a(wmVar)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, wmVar, wmVar.getResourceProvider()).j();
        }
        wmVar.ud(false);
    }

    @Override
    public final void z(int i3) {
        wm wmVar = this.f49812a;
        if (i3 == 0) {
            if (wmVar.getMessagesController().r2(wmVar.f51376k6, wmVar.b(), null)) {
                wmVar.Ec(true);
            }
            if (org.telegram.ui.Components.fc.a(wmVar)) {
                org.telegram.ui.Components.fc.z(wmVar, 4, i3, wmVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        wmVar.getNotificationsController().H(wmVar.f51376k6, i3, wmVar.b());
        if (org.telegram.ui.Components.fc.a(wmVar)) {
            org.telegram.ui.Components.fc.z(wmVar, 5, i3, wmVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
    }
}
