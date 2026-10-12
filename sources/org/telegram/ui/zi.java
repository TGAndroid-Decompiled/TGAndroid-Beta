package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi implements Runnable {
    public final int f44856a;
    public final aj f44857b;
    public final int f44858c;
    public final boolean d;
    public final org.telegram.ui.Components.nl0 f44859e;
    public final float f44860f;
    public final float h;
    public final zg.n0 f44861n;

    public zi(aj ajVar, int i10, boolean z10, org.telegram.ui.Components.nl0 nl0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f44856a = i11;
        this.f44857b = ajVar;
        this.f44858c = i10;
        this.d = z10;
        this.f44859e = nl0Var;
        this.f44860f = f7;
        this.h = f10;
        this.f44861n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44856a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zi(this.f44857b, this.f44858c, this.d, this.f44859e, this.f44860f, this.h, this.f44861n, 1), 50L);
                return;
            default:
                eo eoVar = this.f44857b.f35858s;
                org.telegram.ui.Cells.a0 t82 = eoVar.t8(this.f44858c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    zg.j0.d(eoVar, this.f44859e, t82, null, this.f44860f, this.h, this.f44861n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
