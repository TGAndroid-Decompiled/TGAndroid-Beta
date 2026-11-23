package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class yi implements org.telegram.ui.Components.no {
    public final bn f54383a;

    public yi(bn bnVar) {
        this.f54383a = bnVar;
    }

    @Override
    public final void J() {
        int i7;
        bn bnVar = this.f54383a;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25753g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.xs.v(bnVar.f46271l6, bnVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(bnVar.f46271l6, bnVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.kc.a(bnVar)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override
    public final void Q(int i7) {
        bn bnVar = this.f54383a;
        if (i7 == 0) {
            if (bnVar.getMessagesController().u2(bnVar.f46271l6, bnVar.b(), null)) {
                bnVar.Ic(true);
            }
            if (org.telegram.ui.Components.kc.a(bnVar)) {
                org.telegram.ui.Components.kc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        bnVar.getNotificationsController().H(bnVar.f46271l6, i7, bnVar.b());
        if (org.telegram.ui.Components.kc.a(bnVar)) {
            org.telegram.ui.Components.kc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f54383a.f46240j0.V(null, null);
    }

    @Override
    public final void v() {
        bn bnVar = this.f54383a;
        bnVar.Ic(true);
        org.telegram.ui.Components.kc.A(bnVar, bnVar.getMessagesController().u2(bnVar.f46271l6, bnVar.b(), null), bnVar.Ba).j();
    }

    @Override
    public final void y() {
        bn bnVar = this.f54383a;
        if (bnVar.f46271l6 != 0 && bnVar.f46204g4 != 3) {
            if (bnVar.f46187f != null) {
                bnVar.getMessagesController().e4(bnVar.f46187f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46271l6);
            if (bnVar.b() != 0) {
                bundle.putLong("topic_id", bnVar.b());
            }
            bnVar.presentFragment(new hx0(bundle, bnVar.Ba));
        }
    }

    @Override
    public final void u() {
    }
}
