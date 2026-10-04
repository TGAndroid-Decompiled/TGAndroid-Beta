package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends nf.e {
    public final int d;
    public final int f42892e;
    public final org.telegram.ui.Cells.u1 f42893f;
    public final yn f42894g;
    public final Object h;

    public xi(yn ynVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f42894g = ynVar;
        this.f42892e = i10;
        this.h = obj;
        this.f42893f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42892e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42892e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42892e;
                yn ynVar = this.f42894g;
                ynVar.f43511tb = i10;
                ynVar.f43524ub = 1;
                ynVar.f43536vb = (CharacterStyle) this.h;
                this.f42893f.invalidate();
                return;
            default:
                int i11 = this.f42892e;
                yn ynVar2 = this.f42894g;
                ynVar2.f43511tb = i11;
                ynVar2.f43524ub = 3;
                ynVar2.f43550wb = (String) this.h;
                this.f42893f.invalidate();
                return;
        }
    }
}
