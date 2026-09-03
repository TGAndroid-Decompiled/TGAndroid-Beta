package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yi extends ze.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f40284f;
    public final zn f40285g;

    public yi(zn znVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f40285g = znVar;
        this.e = i10;
        this.f40284f = s1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 18), 240L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 21), 240L);
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
                zn znVar = this.f40285g;
                znVar.f40757tb = i10;
                znVar.f40770ub = 6;
                this.f40284f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.f40285g;
                znVar2.f40757tb = i11;
                znVar2.f40770ub = 5;
                znVar2.f40797wb = null;
                this.f40284f.invalidate();
                return;
            default:
                int i12 = this.e;
                zn znVar3 = this.f40285g;
                znVar3.f40757tb = i12;
                znVar3.f40770ub = 7;
                this.f40284f.invalidate();
                return;
        }
    }
}
