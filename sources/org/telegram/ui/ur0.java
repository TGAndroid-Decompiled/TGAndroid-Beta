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
public final class ur0 implements Runnable {
    public final int f42555a = 0;
    public final boolean f42556b;
    public final boolean f42557c;
    public final boolean d;
    public final Object f42558e;
    public final Serializable f42559f;
    public final Object h;

    public ur0(us0 us0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f42558e = us0Var;
        this.f42559f = iArr;
        this.h = iArr2;
        this.f42556b = z10;
        this.f42557c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.a8 a8Var;
        org.telegram.ui.Components.yc ycVar;
        int i10 = this.f42555a;
        Object obj = this.h;
        Serializable serializable = this.f42559f;
        Object obj2 = this.f42558e;
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
                boolean z10 = this.f42556b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33726c2 = 2;
                photoViewer.f33885u2 = false;
                photoViewer.d = new hu0(photoViewer, photoViewer.d, messageObject, orientation, this.f42557c, this.d);
                photoViewer.f33839p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                eo eoVar = photoViewer.l4;
                if (eoVar != null && eoVar.Y != null && eoVar.C9()) {
                    photoViewer.l4.Y.Q();
                } else {
                    photoViewer.S1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33743e0.setAlpha(1.0f);
                photoViewer.Z1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                w5 w5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33856r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                w5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.z1 z1Var = photoViewer.S0;
                if (photoViewer.f33856r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                z1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-a8Var.getHeight());
                uu0 uu0Var = photoViewer.Q1;
                if (photoViewer.f33856r1) {
                    f11 = 154.0f;
                }
                uu0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.B7 = 0;
                return;
            default:
                us0 us0Var = (us0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    yu0 yu0Var = us0Var.f42563b.f33743e0;
                    boolean z11 = this.f42556b;
                    boolean z12 = this.f42557c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        ycVar = org.telegram.ui.Components.yc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            ycVar = org.telegram.ui.Components.yc.f33038s;
                        } else {
                            ycVar = org.telegram.ui.Components.yc.f33037r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            ycVar = org.telegram.ui.Components.yc.f33036n;
                        } else {
                            ycVar = org.telegram.ui.Components.yc.h;
                        }
                    } else if (i13 > 1) {
                        ycVar = org.telegram.ui.Components.yc.f33035f;
                    } else {
                        ycVar = org.telegram.ui.Components.yc.f33034e;
                    }
                    new org.telegram.ui.Components.zc(yu0Var, null).m(ycVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public ur0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f42558e = photoViewer;
        this.f42559f = file;
        this.f42556b = z10;
        this.h = messageObject;
        this.f42557c = z11;
        this.d = z12;
    }
}
