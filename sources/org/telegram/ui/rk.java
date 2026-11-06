package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class rk implements kl {
    public final an f49505a;
    public final an f49506b;

    public rk(an anVar, an anVar2) {
        this.f49506b = anVar;
        this.f49505a = anVar2;
    }

    @Override
    public final void T0(int i7) {
        this.f49506b.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public final void Y(boolean z9, boolean z10) {
        int a92;
        ArrayList arrayList;
        org.telegram.ui.Components.kb kbVar;
        int i7;
        an anVar = this.f49506b;
        if (z9) {
            ArrayList arrayList2 = new ArrayList(anVar.T4);
            ArrayList arrayList3 = new ArrayList(anVar.V4.values());
            org.telegram.ui.Components.cc ccVar = null;
            if (z10) {
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24749d7;
                if (anVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + anVar.f43818j6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + anVar.f43818j6, ((Integer) anVar.T4.get(0)).intValue()).commit();
                }
                anVar.cd(0, true);
            } else {
                anVar.getNotificationCenter().k(org.telegram.messenger.qs.f25060t0, Long.valueOf(anVar.f43818j6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.cc ccVar2 = anVar.O3;
            if (ccVar2 != null) {
                ccVar2.b();
            }
            anVar.P3 = true;
            int i10 = anVar.Q3 + 1;
            anVar.Q3 = i10;
            boolean z11 = anVar.f43965v4;
            an anVar2 = this.f49505a;
            if (z11) {
                a92 = anVar2.a9();
            } else {
                a92 = anVar.a9();
            }
            int i11 = a92;
            if (anVar.f43965v4) {
                arrayList = anVar2.T4;
            } else {
                arrayList = anVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            qk qkVar = new qk(this, z10, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z10, arrayList4, i10);
            ym ymVar = anVar.f43998xa;
            if (anVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z10) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(anVar.getParentActivity(), ymVar);
                    zbVar.c(2131624060, 28, 28, "Pin", "Line");
                    zbVar.f40883b.setText(org.telegram.messenger.hd.M0(2131747223, null));
                    zbVar.f40884c.setText(org.telegram.messenger.hd.M0(2131747222, null));
                    kbVar = zbVar;
                } else {
                    org.telegram.ui.Components.kb kbVar2 = new org.telegram.ui.Components.kb(anVar.getParentActivity(), ymVar);
                    kbVar2.c(2131624060, 28, 28, "Pin", "Line");
                    kbVar2.f35249b.setText(org.telegram.messenger.hd.G(i11, "MessagesUnpinned", new Object[0]));
                    kbVar = kbVar2;
                }
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(anVar.getParentActivity(), ymVar, true);
                acVar.f31748b = qkVar;
                acVar.f31749c = k0Var;
                kbVar.setButton(acVar);
                ccVar = org.telegram.ui.Components.cc.g(anVar, kbVar, 5000);
            }
            anVar.O3 = ccVar;
            return;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4));
        if (ijVar == null) {
            ijVar = (org.telegram.messenger.ij) anVar.E6[0].get(anVar.X4);
        }
        anVar.Gc(ijVar);
    }

    @Override
    public final void w0(String str) {
        this.f49506b.Da(str, false);
    }
}
