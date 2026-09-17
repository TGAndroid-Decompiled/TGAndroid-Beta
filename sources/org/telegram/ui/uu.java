package org.telegram.ui;

import android.content.Context;
public final class uu extends org.telegram.ui.Components.bd {
    public final vu f38222e0;

    public uu(vu vuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f38222e0 = vuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        xu xuVar = (xu) this.f38222e0.e;
        if (!z10) {
            xuVar.k1();
        } else if (i10 >= 0 && i10 < xuVar.f39707g3.length) {
            int i12 = 0;
            while (true) {
                wu[] wuVarArr = xuVar.f39707g3;
                i11 = -1;
                if (i12 < wuVarArr.length) {
                    if (wuVarArr[i12].d == i10) {
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
                if (i13 < xuVar.f39703c3.size()) {
                    su suVar = (su) xuVar.f39703c3.get(i13);
                    if (suVar != null && suVar.f15543a == 2 && suVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                xuVar.f1(new i2.v(i11, 3), 0, true);
            } else {
                xuVar.k1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
