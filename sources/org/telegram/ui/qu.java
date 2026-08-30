package org.telegram.ui;

import android.content.Context;
public final class qu extends org.telegram.ui.Components.wc {
    public final ru f37843b0;

    public qu(ru ruVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f37843b0 = ruVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z4) {
        int i11;
        tu tuVar = (tu) this.f37843b0.e;
        if (!z4) {
            tuVar.j1();
        } else if (i10 >= 0 && i10 < tuVar.f38753d3.length) {
            int i12 = 0;
            while (true) {
                su[] suVarArr = tuVar.f38753d3;
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
                if (i13 < tuVar.Z2.size()) {
                    ou ouVar = (ou) tuVar.Z2.get(i13);
                    if (ouVar != null && ouVar.f1808a == 2 && ouVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                tuVar.e1(new d4.b(i11, 3), 0, true);
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
