package org.telegram.ui;

import android.content.Context;
public final class su extends org.telegram.ui.Components.bd {
    public final tu f37487e0;

    public su(tu tuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f37487e0 = tuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        vu vuVar = (vu) this.f37487e0.e;
        if (!z10) {
            vuVar.j1();
        } else if (i10 >= 0 && i10 < vuVar.f38628g3.length) {
            int i12 = 0;
            while (true) {
                uu[] uuVarArr = vuVar.f38628g3;
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
                if (i13 < vuVar.f38624c3.size()) {
                    qu quVar = (qu) vuVar.f38624c3.get(i13);
                    if (quVar != null && quVar.f15531a == 2 && quVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                vuVar.e1(new i2.v(i11, 3), 0, true);
            } else {
                vuVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
