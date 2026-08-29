package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri extends ye.c {
    public final int d;
    public final int f42117e;
    public final org.telegram.ui.Cells.s1 f42118f;
    public final tn f42119g;

    public ri(tn tnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f42119g = tnVar;
        this.f42117e = i10;
        this.f42118f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.f42117e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.f42117e, 24), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.f42117e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42117e;
                tn tnVar = this.f42119g;
                tnVar.f42971sb = i10;
                tnVar.f42984tb = 6;
                this.f42118f.invalidate();
                return;
            case 1:
                int i11 = this.f42117e;
                tn tnVar2 = this.f42119g;
                tnVar2.f42971sb = i11;
                tnVar2.f42984tb = 5;
                tnVar2.f43010vb = null;
                this.f42118f.invalidate();
                return;
            default:
                int i12 = this.f42117e;
                tn tnVar3 = this.f42119g;
                tnVar3.f42971sb = i12;
                tnVar3.f42984tb = 7;
                this.f42118f.invalidate();
                return;
        }
    }
}
