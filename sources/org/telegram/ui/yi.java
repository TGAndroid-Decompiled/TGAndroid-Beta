package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
public final class yi implements org.telegram.ui.Components.qo {
    public final bn f54192a;

    public yi(bn bnVar) {
        this.f54192a = bnVar;
    }

    @Override
    public final void B(int i7) {
        bn bnVar = this.f54192a;
        if (i7 == 0) {
            if (bnVar.getMessagesController().u2(bnVar.f46056l6, bnVar.d(), null)) {
                bnVar.Ic(true);
            }
            if (org.telegram.ui.Components.lc.a(bnVar)) {
                org.telegram.ui.Components.lc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        bnVar.getNotificationsController().H(bnVar.f46056l6, i7, bnVar.d());
        if (org.telegram.ui.Components.lc.a(bnVar)) {
            org.telegram.ui.Components.lc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f54192a.f46025j0.V(null, null);
    }

    @Override
    public final void s() {
        bn bnVar = this.f54192a;
        bnVar.Ic(true);
        org.telegram.ui.Components.lc.A(bnVar, bnVar.getMessagesController().u2(bnVar.f46056l6, bnVar.d(), null), bnVar.Ba).j();
    }

    @Override
    public final void u() {
        bn bnVar = this.f54192a;
        if (bnVar.f46056l6 != 0 && bnVar.f45989g4 != 3) {
            if (bnVar.f45972f != null) {
                bnVar.getMessagesController().e4(bnVar.f45972f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46056l6);
            if (bnVar.d() != 0) {
                bundle.putLong("topic_id", bnVar.d());
            }
            bnVar.presentFragment(new jx0(bundle, bnVar.Ba));
        }
    }

    @Override
    public final void w() {
        int i7;
        bn bnVar = this.f54192a;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i7).f25821g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.ys.v(bnVar.f46056l6, bnVar.d(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.ys.v(bnVar.f46056l6, bnVar.d(), false), z11).apply();
        if (org.telegram.ui.Components.lc.a(bnVar)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override
    public final void p() {
    }
}
