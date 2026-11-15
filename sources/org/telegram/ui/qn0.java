package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class qn0 implements Runnable {
    public final int f50697a = 0;
    public final boolean f50698b;
    public final boolean f50699c;
    public final boolean d;
    public final Object f50700e;
    public final Serializable f50701f;
    public final Object h;

    public qn0(oo0 oo0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f50700e = oo0Var;
        this.f50701f = iArr;
        this.h = iArr2;
        this.f50698b = z10;
        this.f50699c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.o7 o7Var;
        org.telegram.ui.Components.bc bcVar;
        int i7 = this.f50697a;
        Object obj = this.h;
        Serializable serializable = this.f50701f;
        Object obj2 = this.f50700e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.V3;
                photoViewer.V3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f50698b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(i10, absolutePath, intValue, z10, 0, 0);
                ffVar.n(L0);
                photoViewer.d2 = 2;
                photoViewer.f42903v2 = false;
                photoViewer.d = new xp0(photoViewer, photoViewer.d, gjVar, ffVar, this.f50699c, this.d);
                photoViewer.f42857q1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.n3(false, false);
                photoViewer.h3(true, false);
                an anVar = photoViewer.f42817l4;
                if (anVar != null && anVar.f45118a0 != null && anVar.V9()) {
                    photoViewer.f42817l4.f45118a0.S();
                } else {
                    photoViewer.Q1();
                }
                photoViewer.M0.setAlpha(255);
                photoViewer.f42763f0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(ffVar), 0, null);
                di.k4 k4Var = photoViewer.Q0;
                float f12 = 96.0f;
                if (photoViewer.f42877s1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                k4Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                oi.u1 u1Var = photoViewer.T0;
                if (photoViewer.f42877s1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                u1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.G.setTranslationY(-o7Var.getHeight());
                kq0 kq0Var = photoViewer.R1;
                if (photoViewer.f42877s1) {
                    f12 = 154.0f;
                }
                kq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.E0();
                photoViewer.e3();
                photoViewer.B7 = 0;
                return;
            default:
                oo0 oo0Var = (oo0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    oq0 oq0Var = oo0Var.f50039b.f42763f0;
                    boolean z11 = this.f50698b;
                    boolean z12 = this.f50699c;
                    int i13 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i13 + (z13 ? 1 : 0) > 1) {
                        bcVar = org.telegram.ui.Components.bc.f33240w;
                    } else if (z13) {
                        if (i12 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f33239s;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.f33238r;
                        }
                    } else if (z11) {
                        if (i12 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f33237n;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.h;
                        }
                    } else if (i12 > 1) {
                        bcVar = org.telegram.ui.Components.bc.f33236f;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.f33235e;
                    }
                    new org.telegram.ui.Components.cc(oq0Var, null).m(bcVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public qn0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.gj gjVar, boolean z11, boolean z12) {
        this.f50700e = photoViewer;
        this.f50701f = file;
        this.f50698b = z10;
        this.h = gjVar;
        this.f50699c = z11;
        this.d = z12;
    }
}
