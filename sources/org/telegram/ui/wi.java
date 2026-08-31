package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wi extends af.f {
    public final int d;
    public final int f42823e;
    public final org.telegram.ui.Cells.t1 f42824f;
    public final xn f42825g;

    public wi(xn xnVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f42825g = xnVar;
        this.f42823e = i10;
        this.f42824f = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42823e, 19), 240L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42823e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42823e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42823e;
                xn xnVar = this.f42825g;
                xnVar.f43360tb = i10;
                xnVar.f43373ub = 6;
                this.f42824f.invalidate();
                return;
            case 1:
                int i11 = this.f42823e;
                xn xnVar2 = this.f42825g;
                xnVar2.f43360tb = i11;
                xnVar2.f43373ub = 5;
                xnVar2.f43400wb = null;
                this.f42824f.invalidate();
                return;
            default:
                int i12 = this.f42823e;
                xn xnVar3 = this.f42825g;
                xnVar3.f43360tb = i12;
                xnVar3.f43373ub = 7;
                this.f42824f.invalidate();
                return;
        }
    }
}
