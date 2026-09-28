package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f39932f;
    public final wn f39933g;

    public xi(wn wnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f39933g = wnVar;
        this.e = i10;
        this.f39932f = u1Var;
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
                wn wnVar = this.f39933g;
                wnVar.f39680vb = i10;
                wnVar.f39694wb = 6;
                this.f39932f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                wn wnVar2 = this.f39933g;
                wnVar2.f39680vb = i11;
                wnVar2.f39694wb = 5;
                wnVar2.f39719yb = null;
                this.f39932f.invalidate();
                return;
            default:
                int i12 = this.e;
                wn wnVar3 = this.f39933g;
                wnVar3.f39680vb = i12;
                wnVar3.f39694wb = 7;
                this.f39932f.invalidate();
                return;
        }
    }
}
