package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class rr0 implements Runnable {
    public final int f41534a = 0;
    public final boolean f41535b;
    public final boolean f41536c;
    public final boolean d;
    public final Object f41537e;
    public final Serializable f41538f;
    public final Object h;

    public rr0(rs0 rs0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f41537e = rs0Var;
        this.f41538f = iArr;
        this.h = iArr2;
        this.f41535b = z10;
        this.f41536c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.a8 a8Var;
        org.telegram.ui.Components.zc zcVar;
        int i10 = this.f41534a;
        Object obj = this.h;
        Serializable serializable = this.f41538f;
        Object obj2 = this.f41537e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f41535b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33949c2 = 2;
                photoViewer.f34108u2 = false;
                photoViewer.d = new eu0(photoViewer, photoViewer.d, messageObject, orientation, this.f41536c, this.d);
                photoViewer.f34062p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                zn znVar = photoViewer.l4;
                if (znVar != null && znVar.Y != null && znVar.C9()) {
                    photoViewer.l4.Y.N();
                } else {
                    photoViewer.S1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33966e0.setAlpha(1.0f);
                photoViewer.Z1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                s5 s5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f34079r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                s5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.z1 z1Var = photoViewer.S0;
                if (photoViewer.f34079r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                z1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-a8Var.getHeight());
                ru0 ru0Var = photoViewer.Q1;
                if (photoViewer.f34079r1) {
                    f11 = 154.0f;
                }
                ru0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.B7 = 0;
                return;
            default:
                rs0 rs0Var = (rs0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    vu0 vu0Var = rs0Var.f41542b.f33966e0;
                    boolean z11 = this.f41535b;
                    boolean z12 = this.f41536c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        zcVar = org.telegram.ui.Components.zc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            zcVar = org.telegram.ui.Components.zc.f33601s;
                        } else {
                            zcVar = org.telegram.ui.Components.zc.f33600r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            zcVar = org.telegram.ui.Components.zc.f33599n;
                        } else {
                            zcVar = org.telegram.ui.Components.zc.h;
                        }
                    } else if (i13 > 1) {
                        zcVar = org.telegram.ui.Components.zc.f33598f;
                    } else {
                        zcVar = org.telegram.ui.Components.zc.f33597e;
                    }
                    new org.telegram.ui.Components.ad(vu0Var, null).m(zcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public rr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f41537e = photoViewer;
        this.f41538f = file;
        this.f41535b = z10;
        this.h = messageObject;
        this.f41536c = z11;
        this.d = z12;
    }
}
