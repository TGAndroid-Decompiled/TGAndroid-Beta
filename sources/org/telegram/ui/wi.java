package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wi extends af.f {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f39749f;
    public final xn f39750g;

    public wi(xn xnVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f39750g = xnVar;
        this.e = i10;
        this.f39749f = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 19), 240L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 22), 240L);
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
                xn xnVar = this.f39750g;
                xnVar.f40191tb = i10;
                xnVar.f40204ub = 6;
                this.f39749f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                xn xnVar2 = this.f39750g;
                xnVar2.f40191tb = i11;
                xnVar2.f40204ub = 5;
                xnVar2.f40231wb = null;
                this.f39749f.invalidate();
                return;
            default:
                int i12 = this.e;
                xn xnVar3 = this.f39750g;
                xnVar3.f40191tb = i12;
                xnVar3.f40204ub = 7;
                this.f39749f.invalidate();
                return;
        }
    }
}
