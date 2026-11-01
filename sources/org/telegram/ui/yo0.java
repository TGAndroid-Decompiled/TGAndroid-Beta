package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class yo0 implements Runnable {
    public final int f43699a = 0;
    public final boolean f43700b;
    public final boolean f43701c;
    public final boolean d;
    public final Object e;
    public final Serializable f43702f;
    public final Object h;

    public yo0(yp0 yp0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = yp0Var;
        this.f43702f = iArr;
        this.h = iArr2;
        this.f43700b = z10;
        this.f43701c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        kg.g1 g1Var;
        org.telegram.ui.Components.bc bcVar;
        int i10 = this.f43699a;
        Object obj = this.h;
        Serializable serializable = this.f43702f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair L0 = org.telegram.messenger.i0.L0(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f43700b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(i11, absolutePath, intValue, z10, 0, 0);
                ffVar.k(L0);
                photoViewer.f33461c2 = 2;
                photoViewer.f33620u2 = false;
                photoViewer.d = new gr0(photoViewer, photoViewer.d, kjVar, ffVar, this.f43701c, this.d);
                photoViewer.f33574p1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                un unVar = photoViewer.l4;
                if (unVar != null && unVar.Z != null && unVar.O9()) {
                    photoViewer.l4.Z.K();
                } else {
                    photoViewer.V1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33477e0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(ffVar), 0, null);
                jg.b1 b1Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33591r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                b1Var.setTranslationY(org.telegram.messenger.i0.L(f7));
                bi.f2 f2Var = photoViewer.S0;
                if (photoViewer.f33591r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                f2Var.setTranslationY(org.telegram.messenger.i0.L(f10));
                photoViewer.F.setTranslationY(-g1Var.getHeight());
                vr0 vr0Var = photoViewer.Q1;
                if (photoViewer.f33591r1) {
                    f11 = 154.0f;
                }
                vr0Var.setTranslationY(org.telegram.messenger.i0.L(f11));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.B7 = 0;
                return;
            default:
                yp0 yp0Var = (yp0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    zr0 zr0Var = yp0Var.f43706b.f33477e0;
                    boolean z11 = this.f43700b;
                    boolean z12 = this.f43701c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        bcVar = org.telegram.ui.Components.bc.f24701w;
                    } else if (z13) {
                        if (i13 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f24700s;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.f24699r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f24698n;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.h;
                        }
                    } else if (i13 > 1) {
                        bcVar = org.telegram.ui.Components.bc.f24697f;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.e;
                    }
                    new org.telegram.ui.Components.cc(zr0Var, null).m(bcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public yo0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.kj kjVar, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f43702f = file;
        this.f43700b = z10;
        this.h = kjVar;
        this.f43701c = z11;
        this.d = z12;
    }
}
