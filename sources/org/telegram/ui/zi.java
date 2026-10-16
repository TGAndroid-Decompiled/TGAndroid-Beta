package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi implements Runnable {
    public final int f42328a;
    public final aj f42329b;
    public final int f42330c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f42331f;
    public final float h;
    public final ah.i1 f42332n;

    public zi(aj ajVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f42328a = i11;
        this.f42329b = ajVar;
        this.f42330c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f42331f = f7;
        this.h = f10;
        this.f42332n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42328a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zi(this.f42329b, this.f42330c, this.d, this.e, this.f42331f, this.h, this.f42332n, 1), 50L);
                return;
            default:
                fo foVar = this.f42329b.f33953s;
                org.telegram.ui.Cells.a0 t82 = foVar.t8(this.f42330c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ah.d1.d(foVar, this.e, t82, null, this.f42331f, this.h, this.f42332n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
