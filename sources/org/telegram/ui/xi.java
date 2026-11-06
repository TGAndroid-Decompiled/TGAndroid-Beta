package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class xi implements org.telegram.ui.Components.xn {
    public final an f51879a;

    public xi(an anVar) {
        this.f51879a = anVar;
    }

    @Override
    public final void L() {
        int i7;
        an anVar = this.f51879a;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24749d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.dt.v(anVar.f43843j6, anVar.b(), false), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(anVar.f43843j6, anVar.b(), false), z10).apply();
        if (org.telegram.ui.Components.hc.a(anVar)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.ud(false);
    }

    @Override
    public final void R(int i7) {
        an anVar = this.f51879a;
        if (i7 == 0) {
            if (anVar.getMessagesController().r2(anVar.f43843j6, anVar.b(), null)) {
                anVar.Ec(true);
            }
            if (org.telegram.ui.Components.hc.a(anVar)) {
                org.telegram.ui.Components.hc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        anVar.getNotificationsController().H(anVar.f43843j6, i7, anVar.b());
        if (org.telegram.ui.Components.hc.a(anVar)) {
            org.telegram.ui.Components.hc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f51879a.f43826i0.U(null, null);
    }

    @Override
    public final void p() {
        an anVar = this.f51879a;
        anVar.Ec(true);
        org.telegram.ui.Components.hc.A(anVar, anVar.getMessagesController().r2(anVar.f43843j6, anVar.b(), null), anVar.f44023xa).j();
    }

    @Override
    public final void y() {
        an anVar = this.f51879a;
        if (anVar.f43843j6 != 0 && anVar.f43791f4 != 3) {
            if (anVar.f43786f != null) {
                anVar.getMessagesController().X3(anVar.f43786f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", anVar.f43843j6);
            if (anVar.b() != 0) {
                bundle.putLong("topic_id", anVar.b());
            }
            anVar.presentFragment(new gx0(bundle, anVar.f44023xa));
        }
    }

    @Override
    public final void n() {
    }
}
