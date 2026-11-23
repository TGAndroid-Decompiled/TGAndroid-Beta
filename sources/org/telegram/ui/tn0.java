package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class tn0 implements Runnable {
    public final int f52358a = 0;
    public final boolean f52359b;
    public final boolean f52360c;
    public final boolean d;
    public final Object f52361e;
    public final Serializable f52362f;
    public final Object h;

    public tn0(ro0 ro0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f52361e = ro0Var;
        this.f52362f = iArr;
        this.h = iArr2;
        this.f52359b = z10;
        this.f52360c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.v7 v7Var;
        org.telegram.ui.Components.kc kcVar;
        int i7 = this.f52358a;
        Object obj = this.h;
        Serializable serializable = this.f52362f;
        Object obj2 = this.f52361e;
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
                boolean z10 = this.f52359b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(i10, absolutePath, intValue, z10, 0, 0);
                ffVar.n(L0);
                photoViewer.d2 = 2;
                photoViewer.f43393v2 = false;
                photoViewer.d = new zp0(photoViewer, photoViewer.d, gjVar, ffVar, this.f52360c, this.d);
                photoViewer.f43347q1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.n3(false, false);
                photoViewer.h3(true, false);
                bn bnVar = photoViewer.f43307l4;
                if (bnVar != null && bnVar.f45950a0 != null && bnVar.V9()) {
                    photoViewer.f43307l4.f45950a0.U();
                } else {
                    photoViewer.Q1();
                }
                photoViewer.M0.setAlpha(255);
                photoViewer.f43253f0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(ffVar), 0, null);
                di.n4 n4Var = photoViewer.Q0;
                float f12 = 96.0f;
                if (photoViewer.f43367s1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                n4Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                oi.w1 w1Var = photoViewer.T0;
                if (photoViewer.f43367s1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                w1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.G.setTranslationY(-v7Var.getHeight());
                mq0 mq0Var = photoViewer.R1;
                if (photoViewer.f43367s1) {
                    f12 = 154.0f;
                }
                mq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.E0();
                photoViewer.e3();
                photoViewer.B7 = 0;
                return;
            default:
                ro0 ro0Var = (ro0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    qq0 qq0Var = ro0Var.f51689b.f43253f0;
                    boolean z11 = this.f52359b;
                    boolean z12 = this.f52360c;
                    int i13 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i13 + (z13 ? 1 : 0) > 1) {
                        kcVar = org.telegram.ui.Components.kc.f36879w;
                    } else if (z13) {
                        if (i12 > 1) {
                            kcVar = org.telegram.ui.Components.kc.f36878s;
                        } else {
                            kcVar = org.telegram.ui.Components.kc.f36877r;
                        }
                    } else if (z11) {
                        if (i12 > 1) {
                            kcVar = org.telegram.ui.Components.kc.f36876n;
                        } else {
                            kcVar = org.telegram.ui.Components.kc.h;
                        }
                    } else if (i12 > 1) {
                        kcVar = org.telegram.ui.Components.kc.f36875f;
                    } else {
                        kcVar = org.telegram.ui.Components.kc.f36874e;
                    }
                    new org.telegram.ui.Components.lc(qq0Var, null).m(kcVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public tn0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.gj gjVar, boolean z11, boolean z12) {
        this.f52361e = photoViewer;
        this.f52362f = file;
        this.f52359b = z10;
        this.h = gjVar;
        this.f52360c = z11;
        this.d = z12;
    }
}
