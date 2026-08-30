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
public final class xq0 implements Runnable {
    public final int f40291a = 0;
    public final boolean f40292b;
    public final boolean f40293c;
    public final boolean d;
    public final Object e;
    public final Serializable f40294f;
    public final Object h;

    public xq0(wr0 wr0Var, int[] iArr, int[] iArr2, boolean z4, boolean z10, boolean z11) {
        this.e = wr0Var;
        this.f40294f = iArr;
        this.h = iArr2;
        this.f40292b = z4;
        this.f40293c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.pc pcVar;
        int i10 = this.f40291a;
        Object obj = this.h;
        Serializable serializable = this.f40294f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.S3;
                photoViewer.S3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z4 = this.f40292b;
                if (z4) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z4, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Z1 = 2;
                photoViewer.f31851r2 = false;
                photoViewer.d = new jt0(photoViewer, photoViewer.d, messageObject, orientation, this.f40293c, this.d);
                photoViewer.f31803m1.l();
                if (photoViewer.R6 == null) {
                    photoViewer.R6 = VelocityTracker.obtain();
                }
                photoViewer.f31921y7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                xn xnVar = photoViewer.f31772i4;
                if (xnVar != null && xnVar.V != null && xnVar.x9()) {
                    photoViewer.f31772i4.V.P();
                } else {
                    photoViewer.R1();
                }
                photoViewer.I0.setAlpha(255);
                photoViewer.f31705b0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                dg.s1 s1Var = photoViewer.M0;
                float f12 = 96.0f;
                if (photoViewer.f31822o1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                s1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.qp0 qp0Var = photoViewer.P0;
                if (photoViewer.f31822o1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                qp0Var.setTranslationY(AndroidUtilities.dp(f11));
                eg.l1 l1Var = photoViewer.C;
                l1Var.setTranslationY(-l1Var.getHeight());
                wt0 wt0Var = photoViewer.N1;
                if (photoViewer.f31822o1) {
                    f12 = 154.0f;
                }
                wt0Var.setTranslationY(AndroidUtilities.dp(f12));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.f31921y7 = 0;
                return;
            default:
                wr0 wr0Var = (wr0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    bu0 bu0Var = wr0Var.f39788b.f31705b0;
                    boolean z10 = this.f40292b;
                    boolean z11 = this.f40293c;
                    int i14 = z10 ? 1 : 0;
                    boolean z12 = this.d;
                    if ((z11 ? 1 : 0) + i14 + (z12 ? 1 : 0) > 1) {
                        pcVar = org.telegram.ui.Components.pc.v;
                    } else if (z12) {
                        if (i13 > 1) {
                            pcVar = org.telegram.ui.Components.pc.f27814s;
                        } else {
                            pcVar = org.telegram.ui.Components.pc.f27813r;
                        }
                    } else if (z10) {
                        if (i13 > 1) {
                            pcVar = org.telegram.ui.Components.pc.f27812n;
                        } else {
                            pcVar = org.telegram.ui.Components.pc.h;
                        }
                    } else if (i13 > 1) {
                        pcVar = org.telegram.ui.Components.pc.f27811f;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.e;
                    }
                    new org.telegram.ui.Components.qc(bu0Var, null).m(pcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public xq0(PhotoViewer photoViewer, File file, boolean z4, MessageObject messageObject, boolean z10, boolean z11) {
        this.e = photoViewer;
        this.f40294f = file;
        this.f40292b = z4;
        this.h = messageObject;
        this.f40293c = z10;
        this.d = z11;
    }
}
