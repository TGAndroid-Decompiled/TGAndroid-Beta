package org.telegram.ui;

import android.content.Context;
public final class ru extends org.telegram.ui.Components.gd {
    public final su f41515e0;

    public ru(su suVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f41515e0 = suVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        uu uuVar = (uu) this.f41515e0.f41771e;
        if (!z10) {
            uuVar.j1();
        } else if (i10 >= 0 && i10 < uuVar.f42560e3.length) {
            int i12 = 0;
            while (true) {
                tu[] tuVarArr = uuVar.f42560e3;
                i11 = -1;
                if (i12 < tuVarArr.length) {
                    if (tuVarArr[i12].d == i10) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 < uuVar.f42556a3.size()) {
                    pu puVar = (pu) uuVar.f42556a3.get(i13);
                    if (puVar != null && puVar.f17125a == 2 && puVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                uuVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                uuVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
