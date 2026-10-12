package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi implements Runnable {
    public final int f42629a;
    public final aj f42630b;
    public final int f42631c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f42632f;
    public final float h;
    public final ah.i1 f42633n;

    public zi(aj ajVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f42629a = i11;
        this.f42630b = ajVar;
        this.f42631c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f42632f = f7;
        this.h = f10;
        this.f42633n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42629a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zi(this.f42630b, this.f42631c, this.d, this.e, this.f42632f, this.h, this.f42633n, 1), 50L);
                return;
            default:
                fo foVar = this.f42630b.f34236s;
                org.telegram.ui.Cells.a0 t82 = foVar.t8(this.f42631c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ah.d1.d(foVar, this.e, t82, null, this.f42632f, this.h, this.f42633n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
