package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class sk implements ll {
    public final bn f52098a;
    public final bn f52099b;

    public sk(bn bnVar, bn bnVar2) {
        this.f52099b = bnVar;
        this.f52098a = bnVar2;
    }

    @Override
    public final void N(boolean z10, boolean z11) {
        int c92;
        ArrayList arrayList;
        org.telegram.ui.Components.nb nbVar;
        int i7;
        bn bnVar = this.f52099b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(bnVar.V4);
            ArrayList arrayList3 = new ArrayList(bnVar.X4.values());
            org.telegram.ui.Components.fc fcVar = null;
            if (z11) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25753g7;
                if (bnVar.V4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + bnVar.f46271l6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + bnVar.f46271l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
                }
                bnVar.gd(0, true);
            } else {
                bnVar.getNotificationCenter().k(org.telegram.messenger.ks.f25290t0, Long.valueOf(bnVar.f46271l6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.fc fcVar2 = bnVar.P3;
            if (fcVar2 != null) {
                fcVar2.b();
            }
            bnVar.Q3 = true;
            int i10 = bnVar.R3 + 1;
            bnVar.R3 = i10;
            boolean z12 = bnVar.f46422x4;
            bn bnVar2 = this.f52098a;
            if (z12) {
                c92 = bnVar2.c9();
            } else {
                c92 = bnVar.c9();
            }
            int i11 = c92;
            if (bnVar.f46422x4) {
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
                    ?? ccVar = new org.telegram.ui.Components.cc(bnVar.getParentActivity(), zmVar);
                    ccVar.c(2131624061, 28, 28, "Pin", "Line");
                    ccVar.f34013b.setText(org.telegram.messenger.gd.N0(2131747030, null));
                    ccVar.f34014c.setText(org.telegram.messenger.gd.N0(2131747029, null));
                    nbVar = ccVar;
                } else {
                    org.telegram.ui.Components.nb nbVar2 = new org.telegram.ui.Components.nb(bnVar.getParentActivity(), zmVar);
                    nbVar2.c(2131624061, 28, 28, "Pin", "Line");
                    nbVar2.f37752b.setText(org.telegram.messenger.gd.G(i11, "MessagesUnpinned", new Object[0]));
                    nbVar = nbVar2;
                }
                org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar.getParentActivity(), zmVar, true);
                dcVar.f34267b = rkVar;
                dcVar.f34268c = l0Var;
                nbVar.setButton(dcVar);
                fcVar = org.telegram.ui.Components.fc.g(bnVar, nbVar, 5000);
            }
            bnVar.P3 = fcVar;
            return;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
        if (fjVar == null) {
            fjVar = (org.telegram.messenger.fj) bnVar.G6[0].get(bnVar.Z4);
        }
        bnVar.Kc(fjVar);
    }

    @Override
    public final void i0(String str) {
        this.f52099b.Ga(str, false);
    }

    @Override
    public final void z0(int i7) {
        this.f52099b.l(i7, 0, true, 0, true, 0);
    }
}
