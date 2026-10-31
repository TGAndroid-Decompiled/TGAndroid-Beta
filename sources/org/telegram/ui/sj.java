package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class sj implements org.telegram.ui.Components.fo {
    public final un f41530a;

    public sj(un unVar) {
        this.f41530a = unVar;
    }

    @Override
    public final void E(int i10) {
        un unVar = this.f41530a;
        if (i10 == 0) {
            if (unVar.getMessagesController().q2(unVar.f42297j6, unVar.b(), null)) {
                unVar.uc(true);
            }
            if (org.telegram.ui.Components.cc.a(unVar)) {
                org.telegram.ui.Components.cc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        unVar.getNotificationsController().H(unVar.f42297j6, i10, unVar.b());
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f41530a.f42279i0.U(null, null);
    }

    @Override
    public final void v() {
        un unVar = this.f41530a;
        unVar.uc(true);
        org.telegram.ui.Components.cc.A(unVar, unVar.getMessagesController().q2(unVar.f42297j6, unVar.b(), null), unVar.f42477xa).j();
    }

    @Override
    public final void x() {
        un unVar = this.f41530a;
        if (unVar.f42297j6 != 0 && unVar.f42248f4 != 3) {
            if (unVar.f42243f != null) {
                unVar.getMessagesController().U3(unVar.f42243f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f42297j6);
            if (unVar.b() != 0) {
                bundle.putLong("topic_id", unVar.b());
            }
            unVar.presentFragment(new uy0(bundle, unVar.f42477xa));
        }
    }

    @Override
    public final void y() {
        int i10;
        un unVar = this.f41530a;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.ot.v(unVar.f42297j6, unVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(unVar.f42297j6, unVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.kd(false);
    }

    @Override
    public final void n() {
    }
}
