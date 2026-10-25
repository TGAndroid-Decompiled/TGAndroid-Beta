package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class ri extends qf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f43168f;
    public final un f43169g;
    public final Object h;

    public ri(un unVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f43169g = unVar;
        this.e = i10;
        this.h = obj;
        this.f43168f = s1Var;
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
                un unVar = this.f43169g;
                unVar.Sb = i10;
                unVar.Tb = 1;
                unVar.Ub = (CharacterStyle) this.h;
                this.f43168f.invalidate();
                return;
            default:
                int i11 = this.e;
                un unVar2 = this.f43169g;
                unVar2.Sb = i11;
                unVar2.Tb = 3;
                unVar2.Vb = (String) this.h;
                this.f43168f.invalidate();
                return;
        }
    }
}
