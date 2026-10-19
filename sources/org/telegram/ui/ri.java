package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f41221f;
    public final qn f41222g;

    public ri(qn qnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f41222g = qnVar;
        this.e = i10;
        this.f41221f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 27), 240L);
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
                qn qnVar = this.f41222g;
                qnVar.f40900wb = i10;
                qnVar.f40914xb = 6;
                this.f41221f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                qn qnVar2 = this.f41222g;
                qnVar2.f40900wb = i11;
                qnVar2.f40914xb = 5;
                qnVar2.f40939zb = null;
                this.f41221f.invalidate();
                return;
            default:
                int i12 = this.e;
                qn qnVar3 = this.f41222g;
                qnVar3.f40900wb = i12;
                qnVar3.f40914xb = 7;
                this.f41221f.invalidate();
                return;
        }
    }
}
