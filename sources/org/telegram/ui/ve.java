package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f42712a = 0;
    public final un f42713b;
    public final org.telegram.messenger.vp f42714c;
    public final CharSequence d;
    public final boolean e;

    public ve(un unVar, CharSequence charSequence, org.telegram.messenger.vp vpVar, boolean z10) {
        this.f42713b = unVar;
        this.d = charSequence;
        this.f42714c = vpVar;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42712a) {
            case 0:
                un.F1(this.f42713b, this.d, this.f42714c, this.e);
                return;
            default:
                un unVar = this.f42713b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42477xa);
                String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                String L02 = org.telegram.messenger.cd.L0(2131747847, null);
                org.telegram.messenger.vp vpVar = this.f42714c;
                alertDialog$Builder.k(L02, new bi.o4(unVar, vpVar, this.d, this.e, 2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var.T = org.telegram.messenger.cd.L0(2131745702, null);
                unVar.showDialog(x1Var);
                vpVar.G2 = 0;
                org.telegram.messenger.vp.d1().edit().putInt("secretWebpage2", vpVar.G2).commit();
                return;
        }
    }

    public ve(un unVar, org.telegram.messenger.vp vpVar, CharSequence charSequence, boolean z10) {
        this.f42713b = unVar;
        this.f42714c = vpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
