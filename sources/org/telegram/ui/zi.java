package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class zi implements org.telegram.ui.Components.wn {
    public final cn f52471a;

    public zi(cn cnVar) {
        this.f52471a = cnVar;
    }

    @Override
    public final void L() {
        int i7;
        cn cnVar = this.f52471a;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24768d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.dt.v(cnVar.f44545j6, cnVar.b(), false), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(cnVar.f44545j6, cnVar.b(), false), z10).apply();
        if (org.telegram.ui.Components.gc.a(cnVar)) {
            org.telegram.ui.Components.gc.S(z9 ? 1 : 0, cnVar, cnVar.getResourceProvider()).j();
        }
        cnVar.xd(false);
    }

    @Override
    public final void R(int i7) {
        cn cnVar = this.f52471a;
        if (i7 == 0) {
            if (cnVar.getMessagesController().r2(cnVar.f44545j6, cnVar.b(), null)) {
                cnVar.Hc(true);
            }
            if (org.telegram.ui.Components.gc.a(cnVar)) {
                org.telegram.ui.Components.gc.z(cnVar, 4, i7, cnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        cnVar.getNotificationsController().H(cnVar.f44545j6, i7, cnVar.b());
        if (org.telegram.ui.Components.gc.a(cnVar)) {
            org.telegram.ui.Components.gc.z(cnVar, 5, i7, cnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f52471a.f44527i0.U(null, null);
    }

    @Override
    public final void p() {
        cn cnVar = this.f52471a;
        cnVar.Hc(true);
        org.telegram.ui.Components.gc.A(cnVar, cnVar.getMessagesController().r2(cnVar.f44545j6, cnVar.b(), null), cnVar.f44750za).j();
    }

    @Override
    public final void y() {
        cn cnVar = this.f52471a;
        if (cnVar.f44545j6 != 0 && cnVar.f44492f4 != 3) {
            if (cnVar.f44487f != null) {
                cnVar.getMessagesController().X3(cnVar.f44487f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", cnVar.f44545j6);
            if (cnVar.b() != 0) {
                bundle.putLong("topic_id", cnVar.b());
            }
            cnVar.presentFragment(new lx0(bundle, cnVar.f44750za));
        }
    }

    @Override
    public final void n() {
    }
}
