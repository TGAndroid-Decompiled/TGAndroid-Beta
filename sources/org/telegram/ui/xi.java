package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f39282f;
    public final xn f39283g;

    public xi(xn xnVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f39283g = xnVar;
        this.e = i10;
        this.f39282f = t1Var;
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
                xn xnVar = this.f39283g;
                xnVar.f39580vb = i10;
                xnVar.f39594wb = 6;
                this.f39282f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                xn xnVar2 = this.f39283g;
                xnVar2.f39580vb = i11;
                xnVar2.f39594wb = 5;
                xnVar2.f39619yb = null;
                this.f39282f.invalidate();
                return;
            default:
                int i12 = this.e;
                xn xnVar3 = this.f39283g;
                xnVar3.f39580vb = i12;
                xnVar3.f39594wb = 7;
                this.f39282f.invalidate();
                return;
        }
    }
}
