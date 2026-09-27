package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40531f;
    public final xn f40532g;

    public zi(xn xnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40532g = xnVar;
        this.e = i10;
        this.f40531f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                xn xnVar = this.f40532g;
                xnVar.f39961vb = i10;
                xnVar.f39975wb = 6;
                this.f40531f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                xn xnVar2 = this.f40532g;
                xnVar2.f39961vb = i11;
                xnVar2.f39975wb = 5;
                xnVar2.f40000yb = null;
                this.f40531f.invalidate();
                return;
            default:
                int i12 = this.e;
                xn xnVar3 = this.f40532g;
                xnVar3.f39961vb = i12;
                xnVar3.f39975wb = 7;
                this.f40531f.invalidate();
                return;
        }
    }
}
