package org.telegram.ui;

import android.content.Context;
public final class qu extends org.telegram.ui.Components.gd {
    public final ru f41259e0;

    public qu(ru ruVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f41259e0 = ruVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        tu tuVar = (tu) this.f41259e0.f41511e;
        if (!z10) {
            tuVar.j1();
        } else if (i10 >= 0 && i10 < tuVar.f42270e3.length) {
            int i12 = 0;
            while (true) {
                su[] suVarArr = tuVar.f42270e3;
                i11 = -1;
                if (i12 < suVarArr.length) {
                    if (suVarArr[i12].d == i10) {
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
                if (i13 < tuVar.f42266a3.size()) {
                    ou ouVar = (ou) tuVar.f42266a3.get(i13);
                    if (ouVar != null && ouVar.f17175a == 2 && ouVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                tuVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                tuVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
