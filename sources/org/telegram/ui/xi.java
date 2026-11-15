package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class xi implements org.telegram.ui.Components.ho {
    public final an f53247a;

    public xi(an anVar) {
        this.f53247a = anVar;
    }

    @Override
    public final void F() {
        an anVar = this.f53247a;
        if (anVar.f45258k6 != 0 && anVar.f45203g4 != 3) {
            if (anVar.f45186f != null) {
                anVar.getMessagesController().X3(anVar.f45186f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", anVar.f45258k6);
            if (anVar.b() != 0) {
                bundle.putLong("topic_id", anVar.b());
            }
            anVar.presentFragment(new fx0(bundle, anVar.Aa));
        }
    }

    @Override
    public final void J() {
        int i7;
        an anVar = this.f53247a;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).f25273e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.at.v(anVar.f45258k6, anVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.at.v(anVar.f45258k6, anVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.cc.a(anVar)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.yd(false);
    }

    @Override
    public final void R(int i7) {
        an anVar = this.f53247a;
        if (i7 == 0) {
            if (anVar.getMessagesController().r2(anVar.f45258k6, anVar.b(), null)) {
                anVar.Ic(true);
            }
            if (org.telegram.ui.Components.cc.a(anVar)) {
                org.telegram.ui.Components.cc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        anVar.getNotificationsController().H(anVar.f45258k6, i7, anVar.b());
        if (org.telegram.ui.Components.cc.a(anVar)) {
            org.telegram.ui.Components.cc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f53247a.f45239j0.V(null, null);
    }

    @Override
    public final void u() {
        an anVar = this.f53247a;
        anVar.Ic(true);
        org.telegram.ui.Components.cc.A(anVar, anVar.getMessagesController().r2(anVar.f45258k6, anVar.b(), null), anVar.Aa).j();
    }

    @Override
    public final void t() {
    }
}
