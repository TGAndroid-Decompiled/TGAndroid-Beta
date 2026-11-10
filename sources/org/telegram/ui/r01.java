package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r01 extends w01 {
    public final int f49198m3;
    public final t11 f49199n3;

    public r01(t11 t11Var, Context context, int i7) {
        super(t11Var, context);
        this.f49199n3 = t11Var;
        this.f49198m3 = i7;
    }

    @Override
    public final void k0(int i7) {
        int i10;
        if (i7 == 0) {
            t11 t11Var = this.f49199n3;
            t11Var.f50071x1 = false;
            if (t11Var.f50017a != -1 && t11Var.f50032f0.getVisibility() == 0 && t11Var.f50032f0.getTranslationY() > (-org.telegram.messenger.g0.L(51.0f))) {
                if (t11Var.f50032f0.getTranslationY() > (-org.telegram.messenger.g0.L(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                t11.a(t11Var, i10, 0);
            }
        }
    }

    @Override
    public final void l0(int i7) {
        int i10;
        org.telegram.ui.Components.tw twVar;
        int i11;
        int i12;
        t11 t11Var = this.f49199n3;
        t11Var.h();
        boolean z9 = false;
        if (!t11Var.f50071x1) {
            int I0 = t11Var.f50055r0.I0();
            ArrayList arrayList = t11Var.D0;
            SparseIntArray sparseIntArray = t11Var.f50067w0;
            if (I0 != -1) {
                int i13 = 40;
                if (arrayList.size() <= 40 || t11Var.C0) {
                    i13 = arrayList.size() + (t11Var.N0 ? 1 : 0);
                }
                if (I0 > i13 && I0 > t11Var.I0.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i14);
                        int valueAt = sparseIntArray.valueAt(i14);
                        if (valueAt >= 0) {
                            twVar = (org.telegram.ui.Components.tw) t11Var.M0.get(valueAt);
                        } else {
                            twVar = null;
                        }
                        if (twVar != null) {
                            boolean z10 = twVar.h;
                            int size = twVar.f38405c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.av avVar = t11Var.f50026d0;
                                if (avVar.D != null) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (avVar.E != null && avVar.f32010b0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                avVar.j(i12 + i11 + valueAt, true);
                            }
                        }
                        i14++;
                    }
                } else {
                    t11Var.f50026d0.j(0, true);
                }
            }
        }
        t11Var.C();
        m01 m01Var = t11Var.f50029e0;
        if (t11Var.f50036h0.computeVerticalScrollOffset() != 0 || (i10 = this.f49198m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6) {
            z9 = true;
        }
        org.telegram.messenger.g0.Z3(m01Var, z9, 1.0f, true, true);
        t11Var.m();
    }
}
