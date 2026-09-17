package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends of.e {
    public final int d;
    public final int f43471e;
    public final org.telegram.ui.Cells.t1 f43472f;
    public final co f43473g;
    public final Object h;

    public zi(co coVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f43473g = coVar;
        this.f43471e = i10;
        this.h = obj;
        this.f43472f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f43471e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f43471e, 23), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f43471e;
                co coVar = this.f43473g;
                coVar.f35499wb = i10;
                coVar.f35512xb = 1;
                coVar.f35524yb = (CharacterStyle) this.h;
                this.f43472f.invalidate();
                return;
            default:
                int i11 = this.f43471e;
                co coVar2 = this.f43473g;
                coVar2.f35499wb = i11;
                coVar2.f35512xb = 3;
                coVar2.f35537zb = (String) this.h;
                this.f43472f.invalidate();
                return;
        }
    }
}
