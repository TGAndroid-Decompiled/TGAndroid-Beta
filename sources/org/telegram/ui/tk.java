package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class tk implements ml {
    public final cn f50291a;
    public final cn f50292b;

    public tk(cn cnVar, cn cnVar2) {
        this.f50292b = cnVar;
        this.f50291a = cnVar2;
    }

    @Override
    public final void T0(int i7) {
        this.f50292b.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public final void Y(boolean z9, boolean z10) {
        int b92;
        ArrayList arrayList;
        org.telegram.ui.Components.jb jbVar;
        int i7;
        cn cnVar = this.f50292b;
        if (z9) {
            ArrayList arrayList2 = new ArrayList(cnVar.T4);
            ArrayList arrayList3 = new ArrayList(cnVar.V4.values());
            org.telegram.ui.Components.bc bcVar = null;
            if (z10) {
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24768d7;
                if (cnVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + cnVar.f44545j6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + cnVar.f44545j6, ((Integer) cnVar.T4.get(0)).intValue()).commit();
                }
                cnVar.fd(0, true);
            } else {
                cnVar.getNotificationCenter().k(org.telegram.messenger.qs.f25081t0, Long.valueOf(cnVar.f44545j6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.bc bcVar2 = cnVar.O3;
            if (bcVar2 != null) {
                bcVar2.b();
            }
            cnVar.P3 = true;
            int i10 = cnVar.Q3 + 1;
            cnVar.Q3 = i10;
            boolean z11 = cnVar.f44693v4;
            cn cnVar2 = this.f50291a;
            if (z11) {
                b92 = cnVar2.b9();
            } else {
                b92 = cnVar.b9();
            }
            int i11 = b92;
            if (cnVar.f44693v4) {
                arrayList = cnVar2.T4;
            } else {
                arrayList = cnVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            sk skVar = new sk(this, z10, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z10, arrayList4, i10);
            an anVar = cnVar.f44750za;
            if (cnVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z10) {
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(cnVar.getParentActivity(), anVar);
                    ybVar.c(2131624060, 28, 28, "Pin", "Line");
                    ybVar.f40545b.setText(org.telegram.messenger.id.M0(2131747224, null));
                    ybVar.f40546c.setText(org.telegram.messenger.id.M0(2131747223, null));
                    jbVar = ybVar;
                } else {
                    org.telegram.ui.Components.jb jbVar2 = new org.telegram.ui.Components.jb(cnVar.getParentActivity(), anVar);
                    jbVar2.c(2131624060, 28, 28, "Pin", "Line");
                    jbVar2.f34883b.setText(org.telegram.messenger.id.G(i11, "MessagesUnpinned", new Object[0]));
                    jbVar = jbVar2;
                }
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(cnVar.getParentActivity(), anVar, true);
                zbVar.f40908b = skVar;
                zbVar.f40909c = k0Var;
                jbVar.setButton(zbVar);
                bcVar = org.telegram.ui.Components.bc.g(cnVar, jbVar, 5000);
            }
            cnVar.O3 = bcVar;
            return;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.V4.get(Integer.valueOf(cnVar.X4));
        if (ijVar == null) {
            ijVar = (org.telegram.messenger.ij) cnVar.E6[0].get(cnVar.X4);
        }
        cnVar.Jc(ijVar);
    }

    @Override
    public final void w0(String str) {
        this.f50292b.Fa(str, false);
    }
}
