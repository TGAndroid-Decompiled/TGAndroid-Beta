package org.telegram.ui;

import android.content.Context;
public final class uu extends org.telegram.ui.Components.fd {
    public final vu f42592e0;

    public uu(vu vuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f42592e0 = vuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        xu xuVar = (xu) this.f42592e0.f42851e;
        if (!z10) {
            xuVar.j1();
        } else if (i10 >= 0 && i10 < xuVar.f44166e3.length) {
            int i12 = 0;
            while (true) {
                wu[] wuVarArr = xuVar.f44166e3;
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
                if (i13 < xuVar.f44162a3.size()) {
                    su suVar = (su) xuVar.f44162a3.get(i13);
                    if (suVar != null && suVar.f16876a == 2 && suVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                xuVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                xuVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
