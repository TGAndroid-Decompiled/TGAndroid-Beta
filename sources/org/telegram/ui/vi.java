package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi extends qf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f44360f;
    public final wn f44361g;

    public vi(wn wnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f44361g = wnVar;
        this.e = i10;
        this.f44360f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 27), 240L);
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
                wn wnVar = this.f44361g;
                wnVar.Wb = i10;
                wnVar.Xb = 6;
                this.f44360f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                wn wnVar2 = this.f44361g;
                wnVar2.Wb = i11;
                wnVar2.Xb = 5;
                wnVar2.Zb = null;
                this.f44360f.invalidate();
                return;
            default:
                int i12 = this.e;
                wn wnVar3 = this.f44361g;
                wnVar3.Wb = i12;
                wnVar3.Xb = 7;
                this.f44360f.invalidate();
                return;
        }
    }
}
