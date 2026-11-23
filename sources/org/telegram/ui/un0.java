package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class un0 implements Runnable {
    public final int f52691a = 0;
    public final boolean f52692b;
    public final boolean f52693c;
    public final boolean d;
    public final Object f52694e;
    public final Serializable f52695f;
    public final Object h;

    public un0(ro0 ro0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f52694e = ro0Var;
        this.f52695f = iArr;
        this.h = iArr2;
        this.f52692b = z10;
        this.f52693c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.u7 u7Var;
        org.telegram.ui.Components.jc jcVar;
        int i7 = this.f52691a;
        Object obj = this.h;
        Serializable serializable = this.f52695f;
        Object obj2 = this.f52694e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.V3;
                photoViewer.V3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f52692b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i10, absolutePath, intValue, z10, 0, 0);
                efVar.n(L0);
                photoViewer.d2 = 2;
                photoViewer.f43474v2 = false;
                photoViewer.d = new zp0(photoViewer, photoViewer.d, fjVar, efVar, this.f52693c, this.d);
                photoViewer.f43428q1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.H7 = 3;
                photoViewer.o3(false, false);
                photoViewer.i3(true, false);
                bn bnVar = photoViewer.f43388l4;
                if (bnVar != null && bnVar.f46118a0 != null && bnVar.V9()) {
                    photoViewer.f43388l4.f46118a0.U();
                } else {
                    photoViewer.R1();
                }
                photoViewer.M0.setAlpha(255);
                photoViewer.f43334f0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(efVar), 0, null);
                di.n4 n4Var = photoViewer.Q0;
                float f12 = 96.0f;
                if (photoViewer.f43448s1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                n4Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                oi.w1 w1Var = photoViewer.T0;
                if (photoViewer.f43448s1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                w1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.G.setTranslationY(-u7Var.getHeight());
                mq0 mq0Var = photoViewer.R1;
                if (photoViewer.f43448s1) {
                    f12 = 154.0f;
                }
                mq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.E0();
                photoViewer.f3();
                photoViewer.H7 = 0;
                return;
            default:
                ro0 ro0Var = (ro0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    qq0 qq0Var = ro0Var.f51804b.f43334f0;
                    boolean z11 = this.f52692b;
                    boolean z12 = this.f52693c;
                    int i13 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i13 + (z13 ? 1 : 0) > 1) {
                        jcVar = org.telegram.ui.Components.jc.f36377w;
                    } else if (z13) {
                        if (i12 > 1) {
                            jcVar = org.telegram.ui.Components.jc.f36376s;
                        } else {
                            jcVar = org.telegram.ui.Components.jc.f36375r;
                        }
                    } else if (z11) {
                        if (i12 > 1) {
                            jcVar = org.telegram.ui.Components.jc.f36374n;
                        } else {
                            jcVar = org.telegram.ui.Components.jc.h;
                        }
                    } else if (i12 > 1) {
                        jcVar = org.telegram.ui.Components.jc.f36373f;
                    } else {
                        jcVar = org.telegram.ui.Components.jc.f36372e;
                    }
                    new org.telegram.ui.Components.kc(qq0Var, null).m(jcVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public un0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.fj fjVar, boolean z11, boolean z12) {
        this.f52694e = photoViewer;
        this.f52695f = file;
        this.f52692b = z10;
        this.h = fjVar;
        this.f52693c = z11;
        this.d = z12;
    }
}
