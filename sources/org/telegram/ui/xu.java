package org.telegram.ui;

import android.content.Context;
public final class xu extends org.telegram.ui.Components.fd {
    public final yu f41662e0;

    public xu(yu yuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f41662e0 = yuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        av avVar = (av) this.f41662e0.e;
        if (!z10) {
            avVar.j1();
        } else if (i10 >= 0 && i10 < avVar.f34094e3.length) {
            int i12 = 0;
            while (true) {
                zu[] zuVarArr = avVar.f34094e3;
                i11 = -1;
                if (i12 < zuVarArr.length) {
                    if (zuVarArr[i12].d == i10) {
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
                if (i13 < avVar.f34090a3.size()) {
                    vu vuVar = (vu) avVar.f34090a3.get(i13);
                    if (vuVar != null && vuVar.f42904a == 2 && vuVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                avVar.e1(new i2.v(i11, 7), 0, true);
            } else {
                avVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
