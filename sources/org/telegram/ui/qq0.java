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
public final class qq0 implements Runnable {
    public final int f42178a = 0;
    public final boolean f42179b;
    public final boolean f42180c;
    public final boolean d;
    public final Object f42181e;
    public final Serializable f42182f;
    public final Object h;

    public qq0(pr0 pr0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f42181e = pr0Var;
        this.f42182f = iArr;
        this.h = iArr2;
        this.f42179b = z10;
        this.f42180c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.nc ncVar;
        int i9 = this.f42178a;
        Object obj = this.h;
        Serializable serializable = this.f42182f;
        Object obj2 = this.f42181e;
        switch (i9) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i10 = photoViewer.R3;
                photoViewer.R3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f42179b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i10, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Y1 = 2;
                photoViewer.f35725q2 = false;
                photoViewer.d = new ct0(photoViewer, photoViewer.d, messageObject, orientation, this.f42180c, this.d);
                photoViewer.l1.l();
                if (photoViewer.Q6 == null) {
                    photoViewer.Q6 = VelocityTracker.obtain();
                }
                photoViewer.f35795x7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                qn qnVar = photoViewer.f35649h4;
                if (qnVar != null && qnVar.U != null && qnVar.x9()) {
                    photoViewer.f35649h4.U.O();
                } else {
                    photoViewer.R1();
                }
                photoViewer.H0.setAlpha(255);
                photoViewer.f35580a0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                bh.g gVar = photoViewer.L0;
                float f12 = 96.0f;
                if (photoViewer.f35699n1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                gVar.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.wo0 wo0Var = photoViewer.O0;
                if (photoViewer.f35699n1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                wo0Var.setTranslationY(AndroidUtilities.dp(f11));
                org.telegram.ui.Components.r7 r7Var = photoViewer.B;
                r7Var.setTranslationY(-r7Var.getHeight());
                pt0 pt0Var = photoViewer.M1;
                if (photoViewer.f35699n1) {
                    f12 = 154.0f;
                }
                pt0Var.setTranslationY(AndroidUtilities.dp(f12));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.f35795x7 = 0;
                return;
            default:
                pr0 pr0Var = (pr0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    tt0 tt0Var = pr0Var.f41587b.f35580a0;
                    boolean z11 = this.f42179b;
                    boolean z12 = this.f42180c;
                    int i13 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i13 + (z13 ? 1 : 0) > 1) {
                        ncVar = org.telegram.ui.Components.nc.v;
                    } else if (z13) {
                        if (i12 > 1) {
                            ncVar = org.telegram.ui.Components.nc.f31068s;
                        } else {
                            ncVar = org.telegram.ui.Components.nc.f31067r;
                        }
                    } else if (z11) {
                        if (i12 > 1) {
                            ncVar = org.telegram.ui.Components.nc.f31066n;
                        } else {
                            ncVar = org.telegram.ui.Components.nc.h;
                        }
                    } else if (i12 > 1) {
                        ncVar = org.telegram.ui.Components.nc.f31065f;
                    } else {
                        ncVar = org.telegram.ui.Components.nc.f31064e;
                    }
                    new org.telegram.ui.Components.oc(tt0Var, null).m(ncVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public qq0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f42181e = photoViewer;
        this.f42182f = file;
        this.f42179b = z10;
        this.h = messageObject;
        this.f42180c = z11;
        this.d = z12;
    }
}
