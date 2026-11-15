package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class rk implements kl {
    public final an f50963a;
    public final an f50964b;

    public rk(an anVar, an anVar2) {
        this.f50964b = anVar;
        this.f50963a = anVar2;
    }

    @Override
    public final void P0(int i7) {
        this.f50964b.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public final void Y(boolean z10, boolean z11) {
        int c92;
        ArrayList arrayList;
        org.telegram.ui.Components.fb fbVar;
        int i7;
        an anVar = this.f50964b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(anVar.U4);
            ArrayList arrayList3 = new ArrayList(anVar.W4.values());
            org.telegram.ui.Components.xb xbVar = null;
            if (z11) {
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).f25273e7;
                if (anVar.U4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + anVar.f45258k6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + anVar.f45258k6, ((Integer) anVar.U4.get(0)).intValue()).commit();
                }
                anVar.gd(0, true);
            } else {
                anVar.getNotificationCenter().k(org.telegram.messenger.ns.f25574t0, Long.valueOf(anVar.f45258k6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.xb xbVar2 = anVar.P3;
            if (xbVar2 != null) {
                xbVar2.b();
            }
            anVar.Q3 = true;
            int i10 = anVar.R3 + 1;
            anVar.R3 = i10;
            boolean z12 = anVar.f45407w4;
            an anVar2 = this.f50963a;
            if (z12) {
                c92 = anVar2.c9();
            } else {
                c92 = anVar.c9();
            }
            int i11 = c92;
            if (anVar.f45407w4) {
                arrayList = anVar2.U4;
            } else {
                arrayList = anVar.U4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            qk qkVar = new qk(this, z11, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i10);
            ym ymVar = anVar.Aa;
            if (anVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(anVar.getParentActivity(), ymVar);
                    ubVar.c(2131624061, 28, 28, "Pin", "Line");
                    ubVar.f39988b.setText(org.telegram.messenger.hd.M0(2131747224, null));
                    ubVar.f39989c.setText(org.telegram.messenger.hd.M0(2131747223, null));
                    fbVar = ubVar;
                } else {
                    org.telegram.ui.Components.fb fbVar2 = new org.telegram.ui.Components.fb(anVar.getParentActivity(), ymVar);
                    fbVar2.c(2131624061, 28, 28, "Pin", "Line");
                    fbVar2.f34556b.setText(org.telegram.messenger.hd.G(i11, "MessagesUnpinned", new Object[0]));
                    fbVar = fbVar2;
                }
                org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(anVar.getParentActivity(), ymVar, true);
                vbVar.f40372b = qkVar;
                vbVar.f40373c = l0Var;
                fbVar.setButton(vbVar);
                xbVar = org.telegram.ui.Components.xb.g(anVar, fbVar, 5000);
            }
            anVar.P3 = xbVar;
            return;
        }
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4));
        if (gjVar == null) {
            gjVar = (org.telegram.messenger.gj) anVar.F6[0].get(anVar.Y4);
        }
        anVar.Kc(gjVar);
    }

    @Override
    public final void v0(String str) {
        this.f50964b.Ga(str, false);
    }
}
