package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class sk implements ll {
    public final bn f52059a;
    public final bn f52060b;

    public sk(bn bnVar, bn bnVar2) {
        this.f52060b = bnVar;
        this.f52059a = bnVar2;
    }

    @Override
    public final void K0(int i7) {
        this.f52060b.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public final void V(boolean z10, boolean z11) {
        int c92;
        ArrayList arrayList;
        org.telegram.ui.Components.ob obVar;
        int i7;
        bn bnVar = this.f52060b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(bnVar.V4);
            ArrayList arrayList3 = new ArrayList(bnVar.X4.values());
            org.telegram.ui.Components.gc gcVar = null;
            if (z11) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25686g7;
                if (bnVar.V4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + bnVar.f46099l6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + bnVar.f46099l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
                }
                bnVar.gd(0, true);
            } else {
                bnVar.getNotificationCenter().k(org.telegram.messenger.ks.f25219t0, Long.valueOf(bnVar.f46099l6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.gc gcVar2 = bnVar.P3;
            if (gcVar2 != null) {
                gcVar2.b();
            }
            bnVar.Q3 = true;
            int i10 = bnVar.R3 + 1;
            bnVar.R3 = i10;
            boolean z12 = bnVar.f46250x4;
            bn bnVar2 = this.f52059a;
            if (z12) {
                c92 = bnVar2.c9();
            } else {
                c92 = bnVar.c9();
            }
            int i11 = c92;
            if (bnVar.f46250x4) {
                arrayList = bnVar2.V4;
            } else {
                arrayList = bnVar.V4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            rk rkVar = new rk(this, z11, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i10);
            zm zmVar = bnVar.Ba;
            if (bnVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? dcVar = new org.telegram.ui.Components.dc(bnVar.getParentActivity(), zmVar);
                    dcVar.c(2131624061, 28, 28, "Pin", "Line");
                    dcVar.f34472b.setText(org.telegram.messenger.gd.N0(2131747030, null));
                    dcVar.f34473c.setText(org.telegram.messenger.gd.N0(2131747029, null));
                    obVar = dcVar;
                } else {
                    org.telegram.ui.Components.ob obVar2 = new org.telegram.ui.Components.ob(bnVar.getParentActivity(), zmVar);
                    obVar2.c(2131624061, 28, 28, "Pin", "Line");
                    obVar2.f38164b.setText(org.telegram.messenger.gd.G(i11, "MessagesUnpinned", new Object[0]));
                    obVar = obVar2;
                }
                org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(bnVar.getParentActivity(), zmVar, true);
                ecVar.f34727b = rkVar;
                ecVar.f34728c = l0Var;
                obVar.setButton(ecVar);
                gcVar = org.telegram.ui.Components.gc.g(bnVar, obVar, 5000);
            }
            bnVar.P3 = gcVar;
            return;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
        if (fjVar == null) {
            fjVar = (org.telegram.messenger.fj) bnVar.G6[0].get(bnVar.Z4);
        }
        bnVar.Kc(fjVar);
    }

    @Override
    public final void x0(String str) {
        this.f52060b.Ga(str, false);
    }
}
