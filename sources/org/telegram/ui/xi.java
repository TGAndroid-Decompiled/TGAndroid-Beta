package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends ze.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f39992f;
    public final zn f39993g;
    public final Object h;

    public xi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f39993g = znVar;
        this.e = i10;
        this.h = obj;
        this.f39992f = s1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 17), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 19), 240L);
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
                zn znVar = this.f39993g;
                znVar.f40757tb = i10;
                znVar.f40770ub = 1;
                znVar.f40783vb = (CharacterStyle) this.h;
                this.f39992f.invalidate();
                return;
            default:
                int i11 = this.e;
                zn znVar2 = this.f39993g;
                znVar2.f40757tb = i11;
                znVar2.f40770ub = 3;
                znVar2.f40797wb = (String) this.h;
                this.f39992f.invalidate();
                return;
        }
    }
}
