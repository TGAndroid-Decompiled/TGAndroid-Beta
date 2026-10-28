package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends qf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f44039f;
    public final wn f44040g;
    public final Object h;

    public ui(wn wnVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f44040g = wnVar;
        this.e = i10;
        this.h = obj;
        this.f44039f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 25), 240L);
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
                wn wnVar = this.f44040g;
                wnVar.Wb = i10;
                wnVar.Xb = 1;
                wnVar.Yb = (CharacterStyle) this.h;
                this.f44039f.invalidate();
                return;
            default:
                int i11 = this.e;
                wn wnVar2 = this.f44040g;
                wnVar2.Wb = i11;
                wnVar2.Xb = 3;
                wnVar2.Zb = (String) this.h;
                this.f44039f.invalidate();
                return;
        }
    }
}
