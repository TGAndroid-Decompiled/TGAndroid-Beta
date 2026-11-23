package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class sk implements ll {
    public final bn f52063a;
    public final bn f52064b;

    public sk(bn bnVar, bn bnVar2) {
        this.f52064b = bnVar;
        this.f52063a = bnVar2;
    }

    @Override
    public final void K0(int i7) {
        this.f52064b.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public final void V(boolean z10, boolean z11) {
        int c92;
        ArrayList arrayList;
        org.telegram.ui.Components.ob obVar;
        int i7;
        bn bnVar = this.f52064b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(bnVar.V4);
            ArrayList arrayList3 = new ArrayList(bnVar.X4.values());
            org.telegram.ui.Components.gc gcVar = null;
            if (z11) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i7).f25857g7;
                if (bnVar.V4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + bnVar.f46103l6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + bnVar.f46103l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
                }
                bnVar.gd(0, true);
            } else {
                bnVar.getNotificationCenter().k(org.telegram.messenger.ls.f25385t0, Long.valueOf(bnVar.f46103l6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.gc gcVar2 = bnVar.P3;
            if (gcVar2 != null) {
                gcVar2.b();
            }
            bnVar.Q3 = true;
            int i10 = bnVar.R3 + 1;
            bnVar.R3 = i10;
            boolean z12 = bnVar.f46254x4;
            bn bnVar2 = this.f52063a;
            if (z12) {
                c92 = bnVar2.c9();
            } else {
                c92 = bnVar.c9();
            }
            int i11 = c92;
            if (bnVar.f46254x4) {
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
                    dcVar.f34467b.setText(org.telegram.messenger.hd.N0(2131747030, null));
                    dcVar.f34468c.setText(org.telegram.messenger.hd.N0(2131747029, null));
                    obVar = dcVar;
                } else {
                    org.telegram.ui.Components.ob obVar2 = new org.telegram.ui.Components.ob(bnVar.getParentActivity(), zmVar);
                    obVar2.c(2131624061, 28, 28, "Pin", "Line");
                    obVar2.f38157b.setText(org.telegram.messenger.hd.G(i11, "MessagesUnpinned", new Object[0]));
                    obVar = obVar2;
                }
                org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(bnVar.getParentActivity(), zmVar, true);
                ecVar.f34725b = rkVar;
                ecVar.f34726c = l0Var;
                obVar.setButton(ecVar);
                gcVar = org.telegram.ui.Components.gc.g(bnVar, obVar, 5000);
            }
            bnVar.P3 = gcVar;
            return;
        }
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
        if (gjVar == null) {
            gjVar = (org.telegram.messenger.gj) bnVar.G6[0].get(bnVar.Z4);
        }
        bnVar.Kc(gjVar);
    }

    @Override
    public final void x0(String str) {
        this.f52064b.Ga(str, false);
    }
}
