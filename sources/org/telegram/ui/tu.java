package org.telegram.ui;

import android.content.Context;
public final class tu extends org.telegram.ui.Components.dd {
    public final uu f37882e0;

    public tu(uu uuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f37882e0 = uuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        wu wuVar = (wu) this.f37882e0.e;
        if (!z10) {
            wuVar.k1();
        } else if (i10 >= 0 && i10 < wuVar.f39239g3.length) {
            int i12 = 0;
            while (true) {
                vu[] vuVarArr = wuVar.f39239g3;
                i11 = -1;
                if (i12 < vuVarArr.length) {
                    if (vuVarArr[i12].d == i10) {
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
                if (i13 < wuVar.f39235c3.size()) {
                    ru ruVar = (ru) wuVar.f39235c3.get(i13);
                    if (ruVar != null && ruVar.f15704a == 2 && ruVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                wuVar.f1(new i2.v(i11, 3), 0, true);
            } else {
                wuVar.k1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
