package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f39372f;
    public final wn f39373g;
    public final Object h;

    public wi(wn wnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f39373g = wnVar;
        this.e = i10;
        this.h = obj;
        this.f39372f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 22), 240L);
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
                wn wnVar = this.f39373g;
                wnVar.f39680vb = i10;
                wnVar.f39694wb = 1;
                wnVar.f39707xb = (CharacterStyle) this.h;
                this.f39372f.invalidate();
                return;
            default:
                int i11 = this.e;
                wn wnVar2 = this.f39373g;
                wnVar2.f39680vb = i11;
                wnVar2.f39694wb = 3;
                wnVar2.f39719yb = (String) this.h;
                this.f39372f.invalidate();
                return;
        }
    }
}
