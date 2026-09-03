package org.telegram.ui;

import android.content.Context;
public final class su extends org.telegram.ui.Components.wc {
    public final tu f38310b0;

    public su(tu tuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f38310b0 = tuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z4) {
        int i11;
        vu vuVar = (vu) this.f38310b0.e;
        if (!z4) {
            vuVar.i1();
        } else if (i10 >= 0 && i10 < vuVar.f39195d3.length) {
            int i12 = 0;
            while (true) {
                uu[] uuVarArr = vuVar.f39195d3;
                i11 = -1;
                if (i12 < uuVarArr.length) {
                    if (uuVarArr[i12].d == i10) {
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
                if (i13 < vuVar.Z2.size()) {
                    qu quVar = (qu) vuVar.Z2.get(i13);
                    if (quVar != null && quVar.f1830a == 2 && quVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                vuVar.d1(new d4.b(i11, 3), 0, true);
            } else {
                vuVar.i1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
