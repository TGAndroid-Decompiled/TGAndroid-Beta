package org.telegram.ui;

import android.content.Context;
public final class qu extends org.telegram.ui.Components.dd {
    public final ru f36912e0;

    public qu(ru ruVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f36912e0 = ruVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        tu tuVar = (tu) this.f36912e0.e;
        if (!z10) {
            tuVar.k1();
        } else if (i10 >= 0 && i10 < tuVar.f37921g3.length) {
            int i12 = 0;
            while (true) {
                su[] suVarArr = tuVar.f37921g3;
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
                if (i13 < tuVar.f37917c3.size()) {
                    ou ouVar = (ou) tuVar.f37917c3.get(i13);
                    if (ouVar != null && ouVar.f15754a == 2 && ouVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                tuVar.f1(new i2.w(i11, 7), 0, true);
            } else {
                tuVar.k1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
