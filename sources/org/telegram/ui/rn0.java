package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class rn0 implements Runnable {
    public final int f49483a = 0;
    public final boolean f49484b;
    public final boolean f49485c;
    public final boolean d;
    public final Object f49486e;
    public final Serializable f49487f;
    public final Object h;

    public rn0(to0 to0Var, int[] iArr, int[] iArr2, boolean z9, boolean z10, boolean z11) {
        this.f49486e = to0Var;
        this.f49487f = iArr;
        this.h = iArr2;
        this.f49484b = z9;
        this.f49485c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.q7 q7Var;
        org.telegram.ui.Components.fc fcVar;
        int i7 = this.f49483a;
        Object obj = this.h;
        Serializable serializable = this.f49487f;
        Object obj2 = this.f49486e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.U3;
                photoViewer.U3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z9 = this.f49484b;
                if (z9) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(i10, absolutePath, intValue, z9, 0, 0);
                gfVar.n(L0);
                photoViewer.f41366c2 = 2;
                photoViewer.f41523u2 = false;
                photoViewer.d = new bq0(photoViewer, photoViewer.d, ijVar, gfVar, this.f49485c, this.d);
                photoViewer.f41477p1.f();
                if (photoViewer.T6 == null) {
                    photoViewer.T6 = VelocityTracker.obtain();
                }
                photoViewer.A7 = 3;
                photoViewer.m3(false, false);
                photoViewer.g3(true, false);
                cn cnVar = photoViewer.f41438k4;
                if (cnVar != null && cnVar.Z != null && cnVar.U9()) {
                    photoViewer.f41438k4.Z.L();
                } else {
                    photoViewer.Q1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f41382e0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(gfVar), 0, null);
                bi.m5 m5Var = photoViewer.P0;
                float f12 = 96.0f;
                if (photoViewer.f41496r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                m5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                li.w1 w1Var = photoViewer.S0;
                if (photoViewer.f41496r1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                w1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.F.setTranslationY(-q7Var.getHeight());
                oq0 oq0Var = photoViewer.Q1;
                if (photoViewer.f41496r1) {
                    f12 = 154.0f;
                }
                oq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.E0();
                photoViewer.d3();
                photoViewer.A7 = 0;
                return;
            default:
                to0 to0Var = (to0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    sq0 sq0Var = to0Var.f50316b.f41382e0;
                    boolean z10 = this.f49484b;
                    boolean z11 = this.f49485c;
                    int i13 = z10 ? 1 : 0;
                    boolean z12 = this.d;
                    if ((z11 ? 1 : 0) + i13 + (z12 ? 1 : 0) > 1) {
                        fcVar = org.telegram.ui.Components.fc.f33517w;
                    } else if (z12) {
                        if (i12 > 1) {
                            fcVar = org.telegram.ui.Components.fc.f33516s;
                        } else {
                            fcVar = org.telegram.ui.Components.fc.f33515r;
                        }
                    } else if (z10) {
                        if (i12 > 1) {
                            fcVar = org.telegram.ui.Components.fc.f33514n;
                        } else {
                            fcVar = org.telegram.ui.Components.fc.h;
                        }
                    } else if (i12 > 1) {
                        fcVar = org.telegram.ui.Components.fc.f33513f;
                    } else {
                        fcVar = org.telegram.ui.Components.fc.f33512e;
                    }
                    new org.telegram.ui.Components.gc(sq0Var, null).m(fcVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public rn0(PhotoViewer photoViewer, File file, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, boolean z11) {
        this.f49486e = photoViewer;
        this.f49487f = file;
        this.f49484b = z9;
        this.h = ijVar;
        this.f49485c = z10;
        this.d = z11;
    }
}
