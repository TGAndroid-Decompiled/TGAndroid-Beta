package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f42504a = 0;
    public final un f42505b;
    public final org.telegram.messenger.wp f42506c;
    public final CharSequence d;
    public final boolean e;

    public ve(un unVar, CharSequence charSequence, org.telegram.messenger.wp wpVar, boolean z10) {
        this.f42505b = unVar;
        this.d = charSequence;
        this.f42506c = wpVar;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42504a) {
            case 0:
                un.Z0(this.f42505b, this.d, this.f42506c, this.e);
                return;
            default:
                un unVar = this.f42505b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42288xa);
                String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                String L02 = org.telegram.messenger.dd.L0(2131747847, null);
                org.telegram.messenger.wp wpVar = this.f42506c;
                alertDialog$Builder.k(L02, new bi.o4(unVar, wpVar, this.d, this.e, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                x1Var.T = org.telegram.messenger.dd.L0(2131745702, null);
                unVar.showDialog(x1Var);
                wpVar.G2 = 0;
                org.telegram.messenger.wp.d1().edit().putInt("secretWebpage2", wpVar.G2).commit();
                return;
        }
    }

    public ve(un unVar, org.telegram.messenger.wp wpVar, CharSequence charSequence, boolean z10) {
        this.f42505b = unVar;
        this.f42506c = wpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
