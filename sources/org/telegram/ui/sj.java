package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class sj implements org.telegram.ui.Components.fo {
    public final un f41380a;

    public sj(un unVar) {
        this.f41380a = unVar;
    }

    @Override
    public final void dismiss() {
        this.f41380a.f42090i0.U(null, null);
    }

    @Override
    public final void s() {
        un unVar = this.f41380a;
        unVar.zc(true);
        org.telegram.ui.Components.cc.A(unVar, unVar.getMessagesController().q2(unVar.f42108j6, unVar.b(), null), unVar.f42288xa).j();
    }

    @Override
    public final void v() {
        un unVar = this.f41380a;
        if (unVar.f42108j6 != 0 && unVar.f42059f4 != 3) {
            if (unVar.f42054f != null) {
                unVar.getMessagesController().U3(unVar.f42054f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f42108j6);
            if (unVar.b() != 0) {
                bundle.putLong("topic_id", unVar.b());
            }
            unVar.presentFragment(new ty0(bundle, unVar.f42288xa));
        }
    }

    @Override
    public final void x() {
        int i10;
        un unVar = this.f41380a;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.pt.v(unVar.f42108j6, unVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(unVar.f42108j6, unVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.pd(false);
    }

    @Override
    public final void y(int i10) {
        un unVar = this.f41380a;
        if (i10 == 0) {
            if (unVar.getMessagesController().q2(unVar.f42108j6, unVar.b(), null)) {
                unVar.zc(true);
            }
            if (org.telegram.ui.Components.cc.a(unVar)) {
                org.telegram.ui.Components.cc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        unVar.getNotificationsController().H(unVar.f42108j6, i10, unVar.b());
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void n() {
    }
}
